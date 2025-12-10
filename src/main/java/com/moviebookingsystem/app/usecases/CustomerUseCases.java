package com.moviebookingsystem.app.usecases;

import com.moviebookingsystem.app.dtos.CustomerRegistrationDTO;
import com.moviebookingsystem.app.dtos.UpdateCustomerDTO;
import com.moviebookingsystem.app.models.*;

import java.util.List;

public class CustomerUseCases {

    public CustomerProfile registerCustomer(CustomerRegistrationDTO details) {
        return null;
    }

    public void deleteCustomer(CustomerProfile customerProfile) {

    }

    public CustomerProfile updateCustomer(UpdateCustomerDTO details) {
        return null;
    }


    public Booking createBooking(Booking booking) {
        return null;
    }

    public Booking cancelBooking(Booking booking) {
        return null;
    }

    public List<Booking> listCustomerBookings(CustomerProfile customerProfile) {
        return null;
    }

    public List<Cinema> listCinemas() {
        return null;
    }

    public List<Movie> listMovies() {
        return null;
    }

    public List<Show> listShows() {
        return null;
    }


    public List<ShowSeat> showSeats() {
        return null;
    }

}
