package com.lld.bookmyshow.model;

import java.util.Set;
import java.util.HashSet;

public class Theatre {
    private final Integer id;
    private String name;
    private Set<Screen> screens;
    private City city;

    public Theatre(Integer id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.screens = new HashSet<>();
    }

    public Theatre(Integer id) {
        this.id = id;
        this.screens = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Screen> getScreens() {
        return screens;
    }

    public void setScreens(Set<Screen> screens) {
        this.screens = screens;
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public Theatre getTheatreById(Integer id) {
        if (this.id.equals(id)) {
            return this;
        }
        return null;
    }
}
