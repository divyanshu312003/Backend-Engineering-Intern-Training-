package com.example.booking.dto;


public class EventResponse {

    private Long id;
    private String name;
    private String genre;
    private String language;

    public EventResponse(Long id, String name, String genre, String language) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.language = language;
    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}
