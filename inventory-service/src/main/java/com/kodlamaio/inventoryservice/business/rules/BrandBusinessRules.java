package com.kodlamaio.inventoryservice.business.rules;

import com.kodlamaio.inventoryservice.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private final BrandRepository repository;

    public void checkIfBrandExists(UUID id) {
        if (!repository.existsById(id)) {
            // TODO : business excepiton
            throw new RuntimeException("Brand_Not_Exists");
        }
    }
}