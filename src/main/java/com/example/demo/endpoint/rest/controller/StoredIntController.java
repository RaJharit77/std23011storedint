package com.example.demo.endpoint.rest.controller;

import com.example.demo.service.StoredIntService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
    private final StoredIntService service;

    @GetMapping("/stored-int")
    public String handleStoredInt() {
        return service.handleStoredInt();
    }
}
