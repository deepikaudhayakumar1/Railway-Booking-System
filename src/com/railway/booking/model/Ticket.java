package com.railway.booking.model;

public class Ticket {

    private int ticketId;
    private Booking booking;
    private String seatNumber;
    private double price;


    public Ticket(int ticketId,
                  Booking booking,
                  String seatNumber,
                  double price){

        this.ticketId = ticketId;
        this.booking = booking;
        this.seatNumber = seatNumber;
        this.price = price;
    }


    public void displayTicket(){

        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);

        System.out.println("\nBooking Information");
        booking.displayBooking();
    }
}
