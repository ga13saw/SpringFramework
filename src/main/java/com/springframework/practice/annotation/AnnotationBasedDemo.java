package com.springframework.practice.annotation;

import com.springframework.practice.model.Canteen;
import com.springframework.practice.model.ExamDepartment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-annotation.xml");
        ExamDepartment examDepartment = context.getBean("examDepartment", ExamDepartment.class);
        examDepartment.arrangeIATExam();

    }
}
