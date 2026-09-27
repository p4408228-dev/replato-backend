package com.replato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/test")
    public Map<String, String> test() {
        return Map.of(
                "status", "running",
                "service", "RePlato Backend",
                "message", "RePlato Backend is Running"
        );
    }
}