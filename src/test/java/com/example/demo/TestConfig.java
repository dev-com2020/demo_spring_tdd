package com.example.demo;


import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public UserRepository userRepository(){
        return Mockito.mock(UserRepository.class);
    }
}
