package com.springframework.practice.stereotype;

import com.springframework.practice.model.Gymkhana;
import com.springframework.practice.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype-bean-config.xml");
        Gymkhana gymkhana = context.getBean("gymkhana", Gymkhana.class);
        System.out.println(gymkhana);


    }
}
