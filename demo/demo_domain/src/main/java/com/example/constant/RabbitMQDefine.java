package com.example.constant;

import org.springframework.stereotype.Component;

@Component
public class RabbitMQDefine {
    public static final String QUEUE = "message_queue";
    public static final String EXCHANGE = "message_exchange";
    public static final String ROUTING_KEY = "message_routingKey";
}
