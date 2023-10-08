package com.springframework.practice.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  //we don't require this annotation when we create bean in configuration class
@Data
public class Gymkhana {
    /**
     * Demonstrating SpEL via @value annotation
     */
    @Value("105")
    private int roomNo;

    //@Value("#{gymCourseList}")
    private List<String> gymCourseList;

    @Value("#{T(java.lang.Math).sqrt(225)}")
    private int numSquare;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{10>5}")
    private boolean isNumGreater;



}
