package com.example.booking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String genre;
    private String language;
    private Integer durationMinutes;

    protected Event() {}

    public Event(String name, String genre, String language, Integer durationMinutes) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.durationMinutes = durationMinutes;
    }

    public Long getId() { return id; }
}