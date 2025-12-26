package com.example.booking.service;

import com.example.booking.dto.EventResponse;
import com.example.booking.entity.Event;
import com.example.booking.repository.EventRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventService {

    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<EventResponse> getAllEvents() {
        return repository.findAll()
                .stream()
                .map(e -> new EventResponse(
                        e.getId(),
                        e.getName(),
                        e.getGenre(),
                        e.getLanguage()
                ))
                .toList();
    }
}
