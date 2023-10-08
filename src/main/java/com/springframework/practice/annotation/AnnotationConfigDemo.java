package com.springframework.practice.annotation;

import com.springframework.practice.config.ApplicationConfiguration;
import com.springframework.practice.model.Gymkhana;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        //Gymkhana getGymKhana = context.getBean("getGymkhana", Gymkhana.class); // manually creating bean in configuration class
        //System.out.println(getGymKhana);

        Gymkhana gymkhana = context.getBean("gymkhana", Gymkhana.class);
        System.out.println(gymkhana);
    }
}
