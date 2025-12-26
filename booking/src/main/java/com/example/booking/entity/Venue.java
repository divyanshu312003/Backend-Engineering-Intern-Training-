package com.example.booking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(optional = false)
    private City city;

    protected Venue() {}

    public Venue(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Long getId() { return id; }
}