package com.jpmc.midascore.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.jpmc.midascore.foundation.Transaction;

@Component
public class TransactionListener {
    
    private static final Logger log = LoggerFactory.getLogger(TransactionListener.class);
    private int count = 0;

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-group")
    public void listen(Transaction transaction) {
        count++;
        log.info("=== RECEIVED TRANSACTION #{} - Amount: {} ===", count, transaction.getAmount());
        if (count <= 4) {
            System.out.println("Transaction #" + count + " Amount: " + transaction.getAmount());
        }
    }
}
