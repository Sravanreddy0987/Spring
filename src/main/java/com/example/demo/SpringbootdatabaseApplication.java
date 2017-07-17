package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="{com.example.topiccontroller}")

public class SpringbootdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatabaseApplication.class, args);
	}
}