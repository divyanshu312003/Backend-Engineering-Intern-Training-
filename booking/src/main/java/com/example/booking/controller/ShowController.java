package com.example.booking.controller;

import com.example.booking.dto.ShowResponse;
import com.example.booking.service.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowController {

    private final ShowService service;

    public ShowController(ShowService service) {
        this.service = service;
    }

    @GetMapping("/venue/{venueId}")
    public List<ShowResponse> getShows(@PathVariable Long venueId) {
        return service.getShowsByVenue(venueId);
    }
}

