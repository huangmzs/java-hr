package com.java158.hrclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrClientApplication.class, args);
	}

}
