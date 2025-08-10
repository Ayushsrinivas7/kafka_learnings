package com.example.Kafkademo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener( topics = "codeDecode_Topic" , groupId = "codeDecode_group")
    public void listenToTopic( String message){
        System.out.println("Listening to Topic : " + message);
    }
}
