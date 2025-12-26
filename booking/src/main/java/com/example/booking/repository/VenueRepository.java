package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
    
}
