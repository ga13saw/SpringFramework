package com.springframework.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lab implements InitializingBean, DisposableBean {
    private int roomNo;
    private String labName;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy bean via interface method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init bean via interface method");
    }
}
