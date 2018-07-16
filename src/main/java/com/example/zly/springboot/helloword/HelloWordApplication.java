package com.example.zly.springboot.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HelloWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
	}
}
