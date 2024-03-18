package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.microservices.limitsservice.service.LimitConfiguration;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
