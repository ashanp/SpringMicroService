package com.perera.microservice.servicetwo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/hello")
public class Service2Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String getHello() {
        String service1Url = "http://service-one/hello";
        String returnValue = restTemplate.getForObject(service1Url, String.class);
        return "the return from service 1 is: " + returnValue;
    }
}
