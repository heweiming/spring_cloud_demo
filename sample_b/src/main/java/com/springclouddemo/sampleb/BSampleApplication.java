package com.springclouddemo.sampleb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BSampleApplication {
	Logger logger = LoggerFactory.getLogger(BSampleApplication.class);
	@Value("${service-name}")
	private String serviceName;

	@RequestMapping("/service")
	public String home() {
		return "Hello world: " + serviceName;
	}
	@RequestMapping("/service_name")
	public String serviceName() {
		logger.info("service_name called");
		return serviceName;
	}
	public static void main(String[] args) {
		SpringApplication.run(BSampleApplication.class, args);
	}

}
