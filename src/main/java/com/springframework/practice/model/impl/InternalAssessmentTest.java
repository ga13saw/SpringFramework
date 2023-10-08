package com.springframework.practice.model.impl;

import com.springframework.practice.model.Exam;

public class InternalAssessmentTest implements Exam {
    @Override
    public void writeExam() {
        System.out.println("Writing IAT paper.");
    }
}
