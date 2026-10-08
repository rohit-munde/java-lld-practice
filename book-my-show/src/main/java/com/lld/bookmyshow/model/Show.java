package com.lld.bookmyshow.model;

import java.util.HashSet;
import java.util.Set;

public class Show {
    private Long id;
    private Movie movie;
    private Screen screen;
    private Long startTime;
    private Long endTime;
    private Set<Ticket> tickets = new HashSet<>();


    public boolean isSeatAvailable(Seat seat) {
        return tickets.stream().noneMatch(ticket -> ticket.getSeat().equals(seat));
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Show(Long id) {
        this.id = id;
    }

    public Show(Long id, Movie movie, Screen screen, Long startTime, Long endTime) {
        this.id = id;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
