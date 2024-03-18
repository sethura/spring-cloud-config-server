package com.in28minutes.microservices.limitsservice.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class LimitConfiguration {
    private int maximum;
    private int minimum;

}
