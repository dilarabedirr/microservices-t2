package com.kodlamaio.maintenanceservice.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMaintenanceRequest {
    private UUID carId;
    private String information;
    private boolean isCompleted;
    private LocalDate startDate;
    private LocalDate endDate;
}
