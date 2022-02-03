package com.github.gabrielpadilh4.kafkaexample.controller;

import com.github.gabrielpadilh4.kafkaexample.dto.MessageRequest;
import com.github.gabrielpadilh4.kafkaexample.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public record MessageController(MessageService messageService) {

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        messageService.sendMessage(messageRequest);
    }
}
