package com.example.booking.service;
import com.example.booking.entity.City;
import java.util.List;



public interface CityService {
    City createCity(String name);
    List<City> getAllCities();
    
}
