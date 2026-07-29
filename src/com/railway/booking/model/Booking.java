package com.railway.booking.model;

public class Booking {
     private int bookingId;
    private User user;
    private Train train;
    private Passenger passenger;
    private String bookingDate;


    public Booking(int bookingId,
                   User user,
                   Train train,
                   Passenger passenger,
                   String bookingDate){

        this.bookingId = bookingId;
        this.user = user;
        this.train = train;
        this.passenger = passenger;
        this.bookingDate = bookingDate;
    }


    public void displayBooking(){

        System.out.println("Booking ID: " + bookingId);

        System.out.println("\nUser Details");
        user.displayUser();

        System.out.println("\nPassenger Details");
        passenger.displayPassenger();

        System.out.println("\nTrain Details");
        train.displayTrain();

        System.out.println("Booking Date: " + bookingDate);
    }


    public int getBookingId(){
        return bookingId;
    }
}
