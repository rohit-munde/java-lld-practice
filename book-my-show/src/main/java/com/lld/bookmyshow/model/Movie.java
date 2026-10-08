package com.lld.bookmyshow.model;

public class Movie {
    private Long id;
    private String name;
    private Integer durationInMinutes;

    public Movie(Long id) {
        this.id = id;
    }

    public Movie(Long id, String name, Integer durationInMinutes) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
