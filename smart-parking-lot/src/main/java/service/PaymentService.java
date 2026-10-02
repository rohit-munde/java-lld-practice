package service;

import model.Ticket;

public class PaymentService {
    /*
     * void Pay(Ticket ticket)
     */

    public static void Pay(Ticket ticket) {
        // Implement logic to calculate the parking fee based on the ticket details
        // For example, you can calculate the duration of parking and apply a rate to determine the fee
        // You can also consider different rates for different vehicle types or parking spot types
        // Once the fee is calculated, you can process the payment (e.g., deduct from user's account, generate a receipt, etc.)

        // Example implementation (you can modify it based on your requirements):
        long durationInMinutes = java.time.Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toMinutes();
        double ratePerMinute = 0.05; // Example rate per minute
        double totalFee = durationInMinutes * ratePerMinute;

        System.out.println("Parking fee for ticket " + ticket.getTicketId() + ": $" + totalFee);
    }
}
