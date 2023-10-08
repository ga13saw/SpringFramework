package com.springframework.practice.model.impl;

import com.springframework.practice.model.Exam;

public class Semester implements Exam {
    @Override
    public void writeExam() {
        System.out.println("Writing sem paper.");
    }
}
