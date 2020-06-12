package com.heiio.book.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Transactional(rollbackFor = RuntimeException.class)
    public String getProducer(String message) {
        kafkaTemplate.executeInTransaction( t -> {
           t.send("test", "message");
           return true;
        });
        return "success";
    }


    @KafkaListener(id = "", topics = "test", groupId = "test.demo")
    public String getConsumer(String input) {
        System.out.println(input);
        return input;
    }
}
