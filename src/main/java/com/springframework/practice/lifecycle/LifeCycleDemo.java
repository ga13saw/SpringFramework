package com.springframework.practice.lifecycle;

import com.springframework.practice.model.Canteen;
import com.springframework.practice.model.ClassRoom;
import com.springframework.practice.model.Lab;
import com.springframework.practice.model.Library;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
//        Library library = context.getBean("library", Library.class);
//        System.out.println(library);
//
//        Lab lab = context.getBean("lab", Lab.class);
//        System.out.println(lab);

//        ClassRoom classRoom = context.getBean("classRoom",ClassRoom.class);
//        System.out.println(classRoom);

        Canteen canteen = context.getBean("canteen", Canteen.class);
        System.out.println(canteen);

        Canteen canteenXml = context.getBean("canteenXml", Canteen.class);
        System.out.println("Xml "+ canteenXml);

        context.registerShutdownHook();

    }
}
