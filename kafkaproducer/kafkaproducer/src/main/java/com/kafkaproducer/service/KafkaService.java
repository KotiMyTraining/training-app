package com.kafkaproducer.service;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test";

    // Method to send a message
    public void sendMessage(String message) {
        kafkaTemplate.send(new ProducerRecord<>(TOPIC, message));
        System.out.println("Sent message: " + message);
    }

}
