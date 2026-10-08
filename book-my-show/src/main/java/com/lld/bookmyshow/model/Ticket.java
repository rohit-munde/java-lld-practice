package com.lld.bookmyshow.model;

import com.lld.bookmyshow.enums.PaymentType;

public class Ticket {
    private Long id;
    private User user;
    private Show show;
    private Seat seat;
    private Double totalAmount;
    private PaymentType paymentType;

    public Ticket(Long id, User user, Show show, Seat seat, Double totalAmount, PaymentType paymentType) {
        this.id = id;
        this.user = user;
        this.show = show;
        this.seat = seat;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
