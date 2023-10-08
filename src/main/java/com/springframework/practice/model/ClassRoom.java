package com.springframework.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassRoom {
    private int roomNo;
    private String className;

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroy bean via annotation method");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("init bean via annotation method");
    }
}
