package com.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproducer.service.KafkaService;

@RestController
public class KafkaController {
	
	@Autowired
    private KafkaService producerService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka topic successfully!";
    }

}
