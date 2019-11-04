package com.java158.hrweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HrWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrWebApplication.class, args);
	}

}
