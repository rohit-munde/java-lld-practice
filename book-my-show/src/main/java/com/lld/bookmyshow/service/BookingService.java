package com.lld.bookmyshow.service;

import com.lld.bookmyshow.model.City;
import com.lld.bookmyshow.model.Movie;
import com.lld.bookmyshow.model.Screen;
import com.lld.bookmyshow.model.Show;
import com.lld.bookmyshow.model.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

public class BookingService {
    private final Set<City> cities;

    public BookingService(Set<City> cities) {
        this.cities = cities;
    }

    public List<Movie> getMoviesByCity(String cityName) {
        Set<Movie> movies = new LinkedHashSet<>();

        for (City city : this.cities) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                for (Theatre theatre : city.getTheatres()) {
                    for (Screen screen : theatre.getScreens()) {
                        for (Show show : screen.getShows()) {
                            movies.add(show.getMovie());
                        }
                    }
                }
            }
        }

        return new ArrayList<>(movies);
    }

    public Show findShowById(Long showId) {
        for (City city : this.cities) {
            for (Theatre theatre : city.getTheatres()) {
                for (Screen screen : theatre.getScreens()) {
                    for (Show show : screen.getShows()) {
                        if (show.getId().equals(showId)) {
                            return show;
                        }
                    }
                }
            }
        }

        return null;
    }
}
