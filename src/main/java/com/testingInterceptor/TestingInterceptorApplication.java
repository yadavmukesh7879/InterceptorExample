package com.testingInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class TestingInterceptorApplication extends SpringServletContainerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TestingInterceptorApplication.class, args);
	}

}
