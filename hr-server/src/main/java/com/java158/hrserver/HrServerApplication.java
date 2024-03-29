package com.java158.hrserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrServerApplication.class, args);
	}

}
