package edu.iu.mralmalk.primesservice.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class MQConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("primes");
    }
}