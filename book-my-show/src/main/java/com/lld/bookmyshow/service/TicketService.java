package com.lld.bookmyshow.service;

import com.lld.bookmyshow.enums.PaymentType;
import com.lld.bookmyshow.model.*;

public class TicketService {

    public Ticket bookTicket(User user, Show show, Seat seat, PaymentType paymentType) {
        if (!show.isSeatAvailable(seat)) {
            throw new RuntimeException("Seat already booked");
        }

        Ticket ticket = new Ticket(System.nanoTime(), user, show, seat, 250.0, paymentType);
        show.addTicket(ticket);
        return ticket;
    }
}
