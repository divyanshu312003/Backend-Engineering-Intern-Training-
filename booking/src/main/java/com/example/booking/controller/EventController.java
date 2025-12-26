package com.example.booking.controller;

import com.example.booking.dto.EventResponse;
import com.example.booking.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping
    public List<EventResponse> listEvents() {
        return service.getAllEvents();
    }
}

