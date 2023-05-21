package com.kodlamaio.inventoryservice.business.dto.responses.get.brand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetBrandResponse {
    private UUID id;
    private String name;
}
