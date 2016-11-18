package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.springframework.cloud.stream.app.time.source")
public class TimemonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimemonitorApplication.class, args);
	}
}
