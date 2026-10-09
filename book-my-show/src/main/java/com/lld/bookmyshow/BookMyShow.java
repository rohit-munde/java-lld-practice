package com.lld.bookmyshow;

import com.lld.bookmyshow.enums.PaymentType;
import com.lld.bookmyshow.model.*;
import com.lld.bookmyshow.service.BookingService;
import com.lld.bookmyshow.service.TicketService;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookMyShow {
    public static void main(String[] args) {
        Set<Theatre> theatresInPune = new HashSet<>();
        Set<Theatre> theatresInMumbai = new HashSet<>();

        City city = new City("Pune", theatresInPune);
        City mumbai = new City("Mumbai", theatresInMumbai);

        theatresInPune.add(new Theatre(1, "Pune Theatre 1", city));
        theatresInPune.add(new Theatre(2, "Pune Theatre 2", city));
        theatresInMumbai.add(new Theatre(1, "Mumbai Theatre 1", mumbai));
        theatresInMumbai.add(new Theatre(2, "Mumbai Theatre 2", mumbai));

        Theatre puneTheatre = theatresInPune.iterator().next();
        Screen puneScreen = new Screen(1L, "Screen 1", puneTheatre);
        Movie interstellar = new Movie(1L, "Interstellar", 169);
        Show eveningShow = new Show(1L, interstellar, puneScreen, 1800L, 2100L);
        puneScreen.addSeat(new Seat(1L, "A1", puneScreen));
        puneScreen.addSeat(new Seat(2L, "A2", puneScreen));
        puneScreen.addShow(eveningShow);
        puneTheatre.addScreen(puneScreen);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose option:");
        System.out.println("1. Search movie by city");
        System.out.println("2. Book ticket");
        System.out.println("0. Exit");
        int option = scanner.nextInt();

        Set<City> cities = new HashSet<>();
        cities.add(city);
        cities.add(mumbai);
        BookingService bookingService = new BookingService(cities);
        TicketService ticketService = new TicketService();

       while (option != 0) {
           switch (option) {
               case 1:
                   System.out.println("Enter city name (Pune/Mumbai):");
                   String cityName = scanner.next();
                   List<Movie> movies = bookingService.getMoviesByCity(cityName);
                   if (movies.isEmpty()) {
                       System.out.println("No movies found for city: " + cityName);
                   } else {
                       System.out.println("Movies in " + cityName + ":");
                       for (Movie movie : movies) {
                           System.out.println("- " + movie.getName());
                       }
                   }
                   break;
               case 2:
                   System.out.println("Enter show id:");
                   long showId = scanner.nextLong();

                   Show show = bookingService.findShowById(showId);
                   if (show == null) {
                       System.out.println("Invalid show id");
                       break;
                   }

                   System.out.println("Enter seat no:");
                   String seatNo = scanner.next();

                   Seat seat = show.getScreen().findSeatBySeatNo(seatNo);
                   if (seat == null) {
                       System.out.println("Invalid seat no");
                       break;
                   }

                   User user = new User(1L, "Rohit", "rohit@email.com");

                   Ticket ticket = ticketService.bookTicket(user, show, seat, PaymentType.UPI);

                   System.out.println("Ticket booked successfully: " + ticket);
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Invalid city");
           }
           System.out.println("Choose option:");
           System.out.println("1. Search movie by city");
           System.out.println("2. Book ticket");
           System.out.println("0. Exit");
           option = scanner.nextInt();
       }
    }
}
