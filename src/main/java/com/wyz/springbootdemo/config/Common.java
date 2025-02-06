package com.wyz.springbootdemo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Common {
    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }
}
