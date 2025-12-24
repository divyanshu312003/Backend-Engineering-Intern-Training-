package com.example.booking.dto;

import jakarta.validation.constraints.NotBlank;

public class CityRequest {
   @NotBlank(message = "City name must not be blank")
    private String name;
    public String getName() {
        return name;
    } 
}
