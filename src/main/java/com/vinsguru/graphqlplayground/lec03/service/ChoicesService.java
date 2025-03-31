package com.vinsguru.graphqlplayground.lec03.service;

import com.vinsguru.graphqlplayground.lec03.dto.CustomerChoiceDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ChoicesService
{
    private final Map<String , List<CustomerChoiceDto>> map = Map.of(
            "sam", List.of(
                    CustomerChoiceDto.create(UUID.randomUUID(), "sam-choice-1"),
                    CustomerChoiceDto.create(UUID.randomUUID(), "sam-choice-2")
            ),
            "mike", List.of(
                    CustomerChoiceDto.create(UUID.randomUUID(), "mike-choice-1"),
                    CustomerChoiceDto.create(UUID.randomUUID(), "mike-choice-2"),
                    CustomerChoiceDto.create(UUID.randomUUID(), "mike-choice-3")
            )
    );

    public Flux<CustomerChoiceDto> getChoicesByCustomerName(String customerName){
        return Flux.fromIterable(map.getOrDefault(customerName, Collections.emptyList()));
    }
}
