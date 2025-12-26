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
@ManyToOne(fetch = FetchType.LAZY, optional = false)
private Event event;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
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

    public void setId(Long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
