package com.example.booking.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "shows",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"venue_id", "startTime"})
    }
)
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Event event;

    @ManyToOne(optional = false)
    private Venue venue;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    protected Show() {}

    public Show(Event event, Venue venue, LocalDateTime startTime, LocalDateTime endTime) {
        this.event = event;
        this.venue = venue;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() { return id; }
}
