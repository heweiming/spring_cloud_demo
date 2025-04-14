package com.springclouddemo.samplec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${service.name}")
    private String serviceName;
    @RequestMapping("/service")
    public String home() {
        return "Hello world: " + serviceName;
    }
}
