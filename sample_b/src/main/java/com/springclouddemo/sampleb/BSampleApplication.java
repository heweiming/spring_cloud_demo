package com.springclouddemo.sampleb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BSampleApplication {

	@Value("${service-name}")
	private String serviceName;

	@RequestMapping("/service")
	public String home() {
		return "Hello world: " + serviceName;
	}
	public static void main(String[] args) {
		SpringApplication.run(BSampleApplication.class, args);
	}

}
