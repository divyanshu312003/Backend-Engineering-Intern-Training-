package com.example.booking.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    // Constructors
    public City() {}
    public City(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }       
    public String getName() {
        return name;
    }
}
