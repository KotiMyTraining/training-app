package com.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    // KafkaListener listens for messages on the specified topic
    @KafkaListener(topics = "test", groupId = "test-consumer-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}