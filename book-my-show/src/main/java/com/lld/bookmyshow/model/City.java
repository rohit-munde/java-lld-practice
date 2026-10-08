package com.lld.bookmyshow.model;

import java.util.HashSet;
import java.util.Set;

public class City {
    private final String name;
    private final Set<Theatre> theatres;

    public City(String name) {
        this.name = name;
        this.theatres = new HashSet<>();
    }

    public City(String name, Set<Theatre> theatres) {
        this.name = name;
        this.theatres = theatres;
    }

    public String getName() {
        return name;
    }

    public Set<Theatre> getTheatres() {
        return theatres;
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }
}
