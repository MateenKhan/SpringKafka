package main.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    private ObjectMapper objectMapper;


    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws  Exception{

        logger.info(String.format("$$ -> Consumed Message -> %s", message));
        Customer customer = objectMapper.readValue(message, Customer.class);
//        logger.info(String.format("message is :", customer.toString()));
        logger.info(customer.getBirthdate().getYear()+"");
    }
}