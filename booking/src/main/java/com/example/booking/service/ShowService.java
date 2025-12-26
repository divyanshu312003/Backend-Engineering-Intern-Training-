package com.example.booking.service;

import com.example.booking.dto.ShowResponse;
import com.example.booking.entity.Show;
import com.example.booking.repository.ShowRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShowService {

    private final ShowRepository repository;

    public ShowService(ShowRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<ShowResponse> getShowsByVenue(Long venueId) {
        List<Show> shows = repository.findByVenueId(venueId);

        return shows.stream()
                .map(show -> new ShowResponse(
                        show.getId(),
                        show.getEvent().getName(),
                        show.getVenue().getName(),
                        show.getStartTime()
                ))
                .toList();
    }
}

