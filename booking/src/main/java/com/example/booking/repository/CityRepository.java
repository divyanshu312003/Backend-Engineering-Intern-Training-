package com.example.booking.repository;
import com.example.booking.entity.City;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findByName(String name);
}
