package com.springframework.practice;

import com.springframework.practice.model.Student;
import com.springframework.practice.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Student student = Student.builder()
//                .studentId("S153095")
//                .studentName("Raju mastani")
//                .build();
//
//        System.out.println(student);

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("Student from IOC container- "+student);

        Student collegeWithConstructor = context.getBean("studentOnCons", Student.class);
        System.out.println("Student from IOC container- "+collegeWithConstructor);

        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
