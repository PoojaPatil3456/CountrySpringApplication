package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
/*@Configuration
@ComponentScan("org.example")*/
public class USAConfig {
    @Bean
    public USA getPhone(){
        return new USA("Message USA");
    }
}