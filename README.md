# Microservices using SpringBoot

This project is just a template of different components of Microservices which include the following: 

* Image Service: The Image Service backend service that returns data in JSON format 
* Gallery Service:  The Gallery service interacts with Image Service sends the data back. This can be imagined which is dependent on some   other service for completion. 
* Eureka Server: To help services to register themselves for service Discovery. 
* Zuul Gateway : To Help users to interact with application without knowledge of internal services.
* Authentication Service: To authenticate the user before allowing access to applications using JWT.


--References: 

[Microservices with Spring Boot — Intro to Microservices](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3)

[Spring boot Getting Started Templates](https://spring.io/guides/gs)

Pending: Addding Log Tracing and Spring Redux
