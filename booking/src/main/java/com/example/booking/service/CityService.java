package com.example.booking.service;
import com.example.booking.repository.CityRepository;
import com.example.booking.entity.City;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CityService {
    private final CityRepository cityRepository;
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public City createCity(String name){
        cityRepository.findByName(name)
        .ifPresent(c -> {
            throw new IllegalArgumentException("City already exist");
        });
      
        return cityRepository.save(new City(name));
    }
    public List<City> getAllCities(){
        return cityRepository.findAll();
    }
}
