package com.service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.service3"})

public class Service3Application {
	public static void main(String[] args) {
		SpringApplication.run(Service3Application.class, args);
	}
}
 