package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.booking.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
