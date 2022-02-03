package com.github.gabrielpadilh4.kafkaexample.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaExample", groupId = "foo")
    void listener(String data) {
        System.out.println("Received data: " + data + " :)");
    }
}
