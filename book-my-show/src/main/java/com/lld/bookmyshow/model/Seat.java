package com.lld.bookmyshow.model;

public class Seat {
    private Long id;
    private String seatNo;
    private Screen screen;

    public Seat(Long id, String seatNo, Screen screen) {
        this.id = id;
        this.seatNo = seatNo;
        this.screen = screen;
    }

    public String getSeatNo() {
        return seatNo;
    }
}
