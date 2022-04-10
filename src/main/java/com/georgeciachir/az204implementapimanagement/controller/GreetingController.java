package com.georgeciachir.az204implementapimanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class GreetingController {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

    /**
     * This endpoint produces JSON, but for this Azure module I am using a <a href="https://docs.microsoft.com/en-us/azure/api-management/api-management-transformation-policies#ConvertJSONtoXML">json-to-xml transforming policy</a>,
     * so the response will be transformed by the Azure policy
     */
    @GetMapping(value = "/hello")
    public GreetingDto sayHello(@RequestParam String name) {
        LOG.info("Greeting [{}]", name);

        return new GreetingDto(name, String.format("Hello, %s!", name), LocalDateTime.now());
    }
}
