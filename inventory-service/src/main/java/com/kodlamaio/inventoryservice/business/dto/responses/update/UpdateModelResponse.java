package com.kodlamaio.inventoryservice.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelResponse {
    private UUID id;
    private UUID brandId;
    private String name;
}
