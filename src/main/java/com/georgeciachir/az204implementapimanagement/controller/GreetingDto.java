package com.georgeciachir.az204implementapimanagement.controller;

import java.time.LocalDateTime;

public class GreetingDto {

    public String receivedName;
    public String greetingMessage;
    public LocalDateTime greetingAt;

    public GreetingDto() {
    }

    public GreetingDto(String receivedName, String greetingMessage, LocalDateTime greetingAt) {
        this.receivedName = receivedName;
        this.greetingMessage = greetingMessage;
        this.greetingAt = greetingAt;
    }
}
