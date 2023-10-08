package com.springframework.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExamDepartment {

    @Qualifier("iat")
    @Autowired
    private Exam exam;

    public void arrangeIATExam(){
        exam.writeExam();
    }
}
