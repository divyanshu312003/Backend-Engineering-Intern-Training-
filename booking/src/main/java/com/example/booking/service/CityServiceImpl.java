package com.example.booking.service;

import com.example.booking.entity.City;
import com.example.booking.exception.BusinessException;
import com.example.booking.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository repository;

    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public City createCity(String name) {
        repository.findByName(name)
                .ifPresent(c -> {
                    throw new BusinessException("City already exists");
                });

        return repository.save(new City(name));
    }

    @Override
    public List<City> getAllCities() {
        return repository.findAll();
    }
}

