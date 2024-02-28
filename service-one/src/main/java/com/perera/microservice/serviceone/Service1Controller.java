package com.perera.microservice.serviceone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class Service1Controller {
	
	private final Map<Long, Product> productMap = new HashMap<>();

    @Value("${value.name}")
    String key1;

    public Service1Controller() {
        productMap.put(1L, new Product(1L, "Iphone 15", 150000.55));
        productMap.put(2L, new Product(2L, "Samsung Ultra", 16000.56));
        productMap.put(3L, new Product(3L, "Oneplus", 6000.99));
        productMap.put(4L, new Product(4L, "Oppo Reno", 200000.99));
        productMap.put(5L, new Product(5L, key1, 55000.99));
    }
	
	@GetMapping("/hello_old")
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Guys"+key1;
    }

}
