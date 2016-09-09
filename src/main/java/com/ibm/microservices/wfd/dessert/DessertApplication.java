package com.ibm.microservices.wfd.dessert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DessertApplication {

	public static void main(String[] args) {
		SpringApplication.run(DessertApplication.class, args);
		System.out.println("Running "+DessertApplication.class+" via Spring Boot!");
	}
}
