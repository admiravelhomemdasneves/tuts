package com.tutorials.tuts.dice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DiceParser DiceParser(String diceExpression) {
        return new DiceParser();
    }
}
