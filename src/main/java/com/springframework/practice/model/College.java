package com.springframework.practice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College {
    private String collegeName;
    private String collegeAddress;
    private String collegeRank;
}
