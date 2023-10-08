package com.springframework.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String studentId;
    private String studentName;
    private String contactNo;
    private String address;
    private List<String> courses;
    private Map<String,Integer> courseToIdMap;
    private Properties properties;
    private College college;

    public Student(String studentId, String studentName, String contactNo, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.contactNo = contactNo;
        this.address = address;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }
}
