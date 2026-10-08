package com.lld.bookmyshow.model;

import java.util.Set;
import java.util.HashSet;

public class Screen {
    private Long id;
    private String name;
    private Set<Seat> seats;
    private Set<Show> shows;
    private Theatre theatre;

    public Screen(Long id, String name, Theatre theatre) {
        this.id = id;
        this.name = name;
        this.theatre = theatre;
        this.seats = new HashSet<>();
        this.shows = new HashSet<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public Set<Show> getShows() {
        return shows;
    }

    public Seat findSeatBySeatNo(String seatNo) {
        return seats.stream()
                .filter(seat -> seat.getSeatNo().equalsIgnoreCase(seatNo))
                .findFirst()
                .orElse(null);
    }
}
