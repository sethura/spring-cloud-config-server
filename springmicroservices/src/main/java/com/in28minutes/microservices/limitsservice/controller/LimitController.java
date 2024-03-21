package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.Configuration;
import com.in28minutes.microservices.limitsservice.LimitConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LimitController {
    private final Configuration configuration;

    @GetMapping("/limits-service")
    private LimitConfiguration limitConfiguration(){
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }

}
