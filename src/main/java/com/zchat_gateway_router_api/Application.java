package com.zchat_gateway_router_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // Já está correto

@SpringBootApplication
@EnableDiscoveryClient // Habilita o cliente Eureka para descoberta de serviços
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}