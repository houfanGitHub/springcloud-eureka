package com.springcloud.eureka.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ribbonConsumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://eurekaClient/hello",String.class).getBody();
    }

}