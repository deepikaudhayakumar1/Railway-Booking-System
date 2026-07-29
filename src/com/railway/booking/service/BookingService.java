package com.railway.booking.service;


import com.railway.booking.model.Booking;
import com.railway.booking.repository.BookingRepository;


import java.util.List;


public class BookingService {


    private BookingRepository bookingRepository;



    public BookingService(){

        bookingRepository = new BookingRepository();

    }




    // Create Booking

    public void createBooking(Booking booking){


        bookingRepository.save(booking);

        System.out.println("Booking Created Successfully");

    }





    // Display Bookings

    public void displayBookings(){


        List<Booking> bookings = bookingRepository.findAll();



        if(bookings.isEmpty()){

            System.out.println("No bookings found");
            return;

        }



        for(Booking booking : bookings){


            System.out.println("=================");
            booking.displayBooking();

        }


    }





    // Search Booking

    public Booking getBookingById(int bookingId){


        return bookingRepository.findByBookingId(bookingId);

    }


}