package com.railway.booking;

import com.railway.booking.model.Train;

public class Main {

    public static void main(String[] args) {

        Train train = new Train(
                101,
                "Chennai Express",
                "Chennai",
                "Bangalore",
                100
        );


        // Display train details
        train.displayTrain();


        // Book one seat
        boolean status = train.bookSeat();


        if(status){
            System.out.println("Seat Booked Successfully");
        }
        else{
            System.out.println("No Seats Available");
        }


        // Check remaining seats
        System.out.println("After Booking:");

        train.displayTrain();
    }
}