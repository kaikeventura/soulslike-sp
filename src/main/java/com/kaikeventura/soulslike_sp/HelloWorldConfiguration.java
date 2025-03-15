package com.kaikeventura.soulslike_sp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    @Primary
    public String dbConnection() {
        return "oi thales";
    }

    @Bean
    public String dbConnection2() {
        return "oi kaike";
    }
}
