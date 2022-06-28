package com.wipro.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
Application class is annotated with the @EnableDiscoveryClient 
(so that this application can be discovered as Eureka client, 
you can also use @EnableEurekaClient annotation instead of @EnableDiscoveryClient)
along with the @SpringBootApplication annotation.
*/

@EnableDiscoveryClient
@SpringBootApplication
public class AccountMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviceApplication.class, args);
	}

}
