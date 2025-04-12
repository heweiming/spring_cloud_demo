package com.springclouddemo;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SomeComponent {
    Logger logger = org.slf4j.LoggerFactory.getLogger(SomeComponent.class);
    public String getName() {
        return name;
    }

    @Value("${service_name}")
    public void setName(String name) {
        logger.info("name = {}", name);
        this.name = name;
    }


    private String name;
}
