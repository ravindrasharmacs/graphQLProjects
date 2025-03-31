package com.vinsguru.graphqlplayground.lec02.dto;

import lombok.Data;

@Data
public class SalaryRangeFilter {
    private Integer minSalary;
    private Integer maxSalary;
}
