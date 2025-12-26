package com.example.booking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

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