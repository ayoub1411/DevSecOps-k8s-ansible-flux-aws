package com.alibou.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

	public static void main(String[] args) {

		System.out.println("DISCOVERY DOCKER STARTED");
		SpringApplication.run(DiscoveryApplication.class, args);
	}





}
