package com.kenny.mm.domainrabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomMessageProducer {

    private static final String topicExchange = "spring-boot-exchange";

    private final RabbitTemplate rabbitTemplate;

    public CustomMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void convertAndSend() {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(topicExchange, "foo.bar.baz", "Hello Message!");
    }
}
