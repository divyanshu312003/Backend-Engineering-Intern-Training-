package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.entity.Show;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findByVenueId(Long venueId);
}
