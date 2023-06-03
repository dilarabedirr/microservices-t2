package com.kodlamaio.filterservice.business.kafka.consumer;

import com.kodlamaio.commonpackage.events.maintenance.MaintenanceCompletedEvent;
import com.kodlamaio.commonpackage.events.maintenance.MaintenanceCreatedEvent;
import com.kodlamaio.commonpackage.events.maintenance.MaintenanceDeletedEvent;
import com.kodlamaio.filterservice.business.abstracts.FilterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MaintenanceConsumer {
    private final FilterService service;

    @KafkaListener(
            topics = "maintenance-created",
            groupId = "filter-maintenance-create"
    )
    public void consume(MaintenanceCreatedEvent event) {
        var filter = service.getByCarId(event.getCarId());
        filter.setState("Maintenance");
        service.add(filter);
        log.info("maintenance created event consumed {}", event);
    }

    @KafkaListener(
            topics = "maintenance-completed",
            groupId = "filter-maintenance-completed"
    )
    public void consume(MaintenanceCompletedEvent event) {
        var filter = service.getByCarId(event.getCarId());
        filter.setState("Available");
        service.add(filter);
        log.info("maintenance completed event consumed {}", event);
    }


    @KafkaListener(
            topics = "maintenance-deleted",
            groupId = "filter-maintenance-deleted")
    public void consume(MaintenanceDeletedEvent event) {
        var filter = service.getByCarId(event.getCarId());
        filter.setState("Available");
        log.info("Maintenance deleted event consumed {}", event);
    }
}
