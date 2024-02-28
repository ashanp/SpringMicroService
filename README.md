Author: Ashan Malinda Perera
Email:  ashanp@gmail.com


This is a Spring cloud application to illustrate the development of microservices using Spring. This have below featured. 
1.	Development of microservices using Spring boot.
All applications are developed using Spring boot and maven as the build automation tool. We have service-one and service-two created to demonstrate below features offered by the spring cloud.
2.	Development of a Service discovery (Eureka).
Eureka services registry is used to register the microservice endpoints. All microservices do not directly talk to each other, but they will first make a call to the eureka service registry and fetch their actual physical address and make calls later.  
3.	Development of ApiGateway.
An API gateway is used as an entry point for all client requests into a microservices architecture. It serves as a single-entry point for clients and provides various functionalities such as routing, security, load balancing, rate limiting, and more.
4.	Development of Spring Config server.
Spring Config Server is a component of the Spring Cloud framework that provides centralized external configuration management for distributed systems and microservices architectures. It allows you to store and manage configuration settings for multiple microservices in a centralized, version-controlled location, typically a Git repository.
5.	Development of Circuit breakers (Resilience4J).
Circuit breakers are a design pattern used in distributed systems to improve fault tolerance and resilience by preventing cascading failures. The concept is analogous to electrical circuit breakers, which interrupt the flow of electricity when a fault occurs to prevent damage to the system
Circuit breakers used between the communication of service-one and service-two to 