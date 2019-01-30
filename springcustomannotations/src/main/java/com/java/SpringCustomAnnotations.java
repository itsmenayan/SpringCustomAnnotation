package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.java")
public class SpringCustomAnnotations {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomAnnotations.class, args);
	}

}

