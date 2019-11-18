package main.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import main.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("$$ -> Producing message --> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }

    public void sendMessage(Customer customer) throws  Exception {
        String customerStr = new ObjectMapper().writeValueAsString(customer);
        logger.info(String.format("$$ -> Producing message --> %s", customerStr));

        this.kafkaTemplate.send(TOPIC, customerStr);
    }
}