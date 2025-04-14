package com.springclouddemo.samplec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CSampleApplication.class, args);
	}

}
