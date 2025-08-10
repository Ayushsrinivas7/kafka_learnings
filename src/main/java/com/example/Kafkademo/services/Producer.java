package com.example.Kafkademo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service()
public class Producer {
    @Autowired
    KafkaTemplate<String  , String > kafkaTemplate;

    public void sendMsgToTopic(String message) {
        kafkaTemplate.send("codeDecode_Topic", message);
    }
}

//Cluster ID: 6eQfe056TImCCPk62bCheQ
//Discovered group coordinator localhost:9092
//# Start Kafka using Homebrew services (this might handle KRaft automatically)
//brew services start kafka

//# Check if Kafka service is running
//brew services list | grep kafka
//
///opt/homebrew/opt/kafka/bin/kafka-topics --create --topic codeDecode_Topic --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1
//
//        /opt/homebrew/opt/kafka/bin/kafka-topics --list --bootstrap-server localhost:9092
//
//        /opt/homebrew/opt/kafka/bin/kafka-console-producer --topic codeDecode_Topic --bootstrap-server localhost:9092
//
//        /opt/homebrew/opt/kafka/bin/kafka-console-consumer --topic codeDecode_Topic --from-beginning --bootstrap-server localhost:9092
//
//        # Stop Kafka
//brew services stop kafka
//
//# Restart Kafka
//brew services restart kafka
//
//# Check status
//brew services list | grep kafka