package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureAppApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot";
	}
}
