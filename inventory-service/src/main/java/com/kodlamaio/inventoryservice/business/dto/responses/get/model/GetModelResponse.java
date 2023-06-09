package com.kodlamaio.inventoryservice.business.dto.responses.get.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetModelResponse {
    private UUID id;
    private UUID brandId;
    private String name;
}
