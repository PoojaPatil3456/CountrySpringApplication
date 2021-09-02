package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GujaratConfig {
    @Bean
    public USA getPhone(){
        return new USA("Famous for tradition");
    }
}