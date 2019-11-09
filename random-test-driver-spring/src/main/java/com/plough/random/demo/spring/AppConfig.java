package com.plough.random.demo.spring;

import com.plough.random.RandomChoiceMachine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

/**
 * @author plough
 * @date 2019/11/9
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class AppConfig {
    @Value("${demo.random.choice.items}")
    private String itemsStr;
    @Value("${demo.random.choice.num}")
    private int num;

    @Bean
    public RandomChoiceMachine randomChoiceMachine() {
        return new RandomChoiceMachine(Arrays.asList(itemsStr.split(",")), num);
    }
}