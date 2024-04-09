package edu.iu.mralmalk.primesservice.rabbitmq;

import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

import java.text.MessageFormat;
import java.util.Queue;

public class MQSender {
    private final Queue queue;
    private final RabbitTemplate rabbitTemplate;

    public MQSender(Queue queue, RabbitTemplate rabbitTemplate) {
        this.queue = queue;
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String username, int n, boolean isPrime) {
        String message =
                MessageFormat
                        .format(
                                "customer: {0}, n: {1}, isPrime: {2}",
                                username,
                                String.valueOf(n),
                                isPrime
                        );
        message = "{" + message + "}";
        rabbitTemplate.convertAndSend("primes", message);
    }
}