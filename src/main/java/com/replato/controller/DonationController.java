package com.replato.controller;

import com.replato.model.Donation;
import com.replato.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {

    @Autowired
    private DonationService service;

    @GetMapping
    public List<Donation> getAll() {
        return service.getAll();
    }

    @GetMapping("/available")
    public List<Donation> getAvailable() {
        return service.getAvailable();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donation> getById(@PathVariable Long id) {
        Donation d = service.getById(id);
        if (d == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(d);
    }

    @PostMapping
    public ResponseEntity<Donation> create(@RequestBody Donation d) {
        if (d.getFoodName() == null || d.getFoodName().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (d.getQuantity() <= 0) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(service.create(d));
    }
}
