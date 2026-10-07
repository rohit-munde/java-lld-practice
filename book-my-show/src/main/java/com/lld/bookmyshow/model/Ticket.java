package com.lld.bookmyshow.model;

import com.lld.bookmyshow.enums.PaymentType;

public class Ticket {
    private Long id;
    private User user;
    private Show show;
    private Seat seat;
    private Double totalAmount;
    private PaymentType paymentType;
}
