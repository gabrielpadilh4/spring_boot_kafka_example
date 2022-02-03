package com.github.gabrielpadilh4.kafkaexample.service;

import com.github.gabrielpadilh4.kafkaexample.dto.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public record MessageService(
        KafkaTemplate<String, String> kafkaTemplate
) {
    public void sendMessage(MessageRequest request) {
        kafkaTemplate.send("kafkaExample" +
                "" +
                "", request.message());
    }
}
