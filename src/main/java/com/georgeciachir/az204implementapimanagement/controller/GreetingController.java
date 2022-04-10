package com.georgeciachir.az204implementapimanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable String name) {
        LOG.info("Greeting [{}]", name);

        return String.format("Hello %s !", name);
    }
}
