package com.kodlamaio.maintenanceservice.business.dto.responses.update;

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
public class UpdateMaintenanceResponse {
    private UUID id;
    private UUID carId;
    private String information;
    private boolean isCompleted;
    private LocalDate startDate;
    private LocalDate endDate;
}
