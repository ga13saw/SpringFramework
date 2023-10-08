package com.springframework.practice.standalone.collection;

import com.springframework.practice.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollectionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone-collection-bean-config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);


    }
}
