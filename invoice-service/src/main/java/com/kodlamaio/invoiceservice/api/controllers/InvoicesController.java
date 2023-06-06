package com.kodlamaio.invoiceservice.api.controllers;

import com.kodlamaio.invoiceservice.business.abstracts.InvoiceService;
import com.kodlamaio.invoiceservice.business.dto.responses.GetAllInvoicesResponse;
import com.kodlamaio.invoiceservice.business.dto.responses.GetInvoiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/invoices")
@AllArgsConstructor
public class InvoicesController {
    private final InvoiceService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllInvoicesResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetInvoiceResponse getById(@PathVariable String id) {
        return service.getById(id);
    }

}
