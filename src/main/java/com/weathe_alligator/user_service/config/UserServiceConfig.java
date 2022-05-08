package com.weathe_alligator.user_service.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfig {

    @Bean
    public DirectExchange userServiceExchange(){
        return new DirectExchange("userServiceExchange");
    }
}
