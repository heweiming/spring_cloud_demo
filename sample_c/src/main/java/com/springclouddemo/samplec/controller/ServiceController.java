package com.springclouddemo.samplec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${service.name}")
    private String serviceName;

    @Autowired
    private NameService nameService;

    @RequestMapping("/service")
    public String home() {
        return "Hello world: " + serviceName;
    }

    @GetMapping("/sample-b")
    public String whatIsBSampleName() {
        return nameService.getName();
    }

    @FeignClient("sample-b")
    static interface NameService {
        @RequestMapping("/service_name")
        public String getName();
    }
}
