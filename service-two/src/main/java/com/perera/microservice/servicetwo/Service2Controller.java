package com.perera.microservice.servicetwo;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
//@RequestMapping("/hello")
public class Service2Controller {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service1.location}")
    String URL_STRING;


    @GetMapping("/hello")
    @CircuitBreaker(name="access-service-one",fallbackMethod = "fallbackServiceOne")
    public String getHello() {
        String service1Url = URL_STRING;//"http://service-one/hello";
        String returnValue = restTemplate.getForObject(service1Url, String.class);
        System.out.println("Call made on service-two microservice @:"+ new Date());
        return "the return from service 1 is: " + returnValue;
    }

    public String fallbackServiceOne(Throwable throwable){
        return "Please wait for a while till the service is up";
    }
}
