package com.example.booking.controller;

import com.example.booking.dto.CityRequest;
import com.example.booking.entity.City;
import com.example.booking.service.CityService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @PostMapping
    public City createCity(@Valid @RequestBody CityRequest request) {
        return service.createCity(request.getName());
    }

    @GetMapping
    public List<City> getCities() {
        return service.getAllCities();
    }
}

