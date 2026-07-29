package com.railway.booking.repository;

import com.railway.booking.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {

    private List<Booking> bookings;


    public BookingRepository() {
        bookings = new ArrayList<>();
    }


    // Save booking
    public void save(Booking booking) {

        bookings.add(booking);

    }


    // Find booking by id
    public Booking findByBookingId(int bookingId) {

        for(Booking booking : bookings) {

            if(booking.getBookingId() == bookingId) {
                return booking;
            }

        }

        return null;
    }


    // Get all bookings
    public List<Booking> findAll() {

        return bookings;

    }


    // Delete booking

    public boolean delete(int bookingId) {

        Booking booking = findByBookingId(bookingId);

        if(booking != null) {

            bookings.remove(booking);
            return true;

        }

        return false;
    }
}