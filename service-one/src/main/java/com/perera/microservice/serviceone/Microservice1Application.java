package com.perera.microservice.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class Microservice1Application {
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}
}

// reference https://dzone.com/articles/using-spring-config-server