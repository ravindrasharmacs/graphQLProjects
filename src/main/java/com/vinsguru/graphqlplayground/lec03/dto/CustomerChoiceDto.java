package com.vinsguru.graphqlplayground.lec03.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class CustomerChoiceDto {
    private UUID id ;
    private String choiceDesc;
}
