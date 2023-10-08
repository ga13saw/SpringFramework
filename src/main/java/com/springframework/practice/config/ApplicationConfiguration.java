package com.springframework.practice.config;

import com.springframework.practice.model.Gymkhana;
import com.springframework.practice.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springframework.practice")
public class ApplicationConfiguration {

    //we can change bean name via @Bean(name="gymkhana")
//    @Bean
//    public Gymkhana getGymkhana(){
//        return new Gymkhana();
//    }
}
