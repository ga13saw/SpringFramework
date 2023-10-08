package com.springframework.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Library {
    private String roomNo;
    private String librarianName;

    public void setRoomNo(String roomNo) {
        System.out.println("Calling setter method of library class");
        this.roomNo = roomNo;
    }

    public void init(){
        System.out.println("calling library init method to initialize");
    }

    public  void destroy(){
        System.out.println("calling destroy method..");
    }
}
