package com.wipro.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Eureka Server for Service Registry and Discovery
//All microservices should be Registered here

/*@EnableEurekaServer annotation indicates that we want to run a Eureka Server.
By seeing a dependency on Spring Cloud Eureaka,
Spring Boot automatically configures the application as a service registry.*/

//You can see the Eureka Server console by accessing URL- http://localhost:8761/

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
