package com.moviebookingsystem.app.usecases;

import com.moviebookingsystem.app.dtos.CreateBookingDTO;
import com.moviebookingsystem.app.dtos.CreateUserDTO;
import com.moviebookingsystem.app.dtos.RegisterCustomerDTO;
import com.moviebookingsystem.app.dtos.UpdateCustomerDTO;
import com.moviebookingsystem.app.exceptions.InvalidCustomerIdException;
import com.moviebookingsystem.app.exceptions.SeatsNotAvailableException;
import com.moviebookingsystem.app.exceptions.ShowNotAcceptingBookingsException;
import com.moviebookingsystem.app.exceptions.accounts.UsernameAlreadyTakenException;
import com.moviebookingsystem.app.models.*;
import com.moviebookingsystem.app.repository.interfaces.*;

import java.util.List;
import java.util.Optional;

public class CustomerUseCases {
    private final UserRepository userRepository;
    private final UserUseCases userUseCases;
    private final CustomerRepository customerRepository;
    private final RoleRepository roleRepository;
    private final ShowRepository showRepository;
    private final BookingRepository bookingRepository;

    public CustomerUseCases(UserRepository userRepository, UserUseCases userUseCases, CustomerRepository customerRepository, RoleRepository roleRepository, ShowRepository showRepository, BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.userUseCases = userUseCases;
        this.customerRepository = customerRepository;
        this.roleRepository = roleRepository;
        this.showRepository = showRepository;
        this.bookingRepository = bookingRepository;
    }


    public Customer registerCustomer(RegisterCustomerDTO details) {

        // check if username is unique
        Optional<User> existing = userRepository.findByUsername(details.getUsername());
        if (existing.isPresent()) {
            throw new UsernameAlreadyTakenException("Username is already taken.");
        }

        User user = userUseCases.createUser(
                new CreateUserDTO(details.getUsername(), details.getPassword())
        );

        Role customerRole = roleRepository.getRoleByName("customer").get();
        user.addRole(customerRole);
        userRepository.save(user);


        Customer customer = Customer.builder()
                .fullname(details.getFullname())
                .city(details.getCity())
                .phone(details.getPhone())
                .email(details.getEmail())
                .build();


        customerRepository.save(customer);

        return customer;
    }


    public void deleteCustomer(Customer customerProfile) {

    }

    public Customer updateCustomer(UpdateCustomerDTO details) {
        return null;
    }


    public Booking createBooking(Customer customer, CreateBookingDTO details) {

        if (!details.getShow().canShowBeBooked()) {
            throw new ShowNotAcceptingBookingsException("Show is not accepting bookings.");
        }

        // acquire some lock
        boolean allSeatsAvailable = details.getShowSeats()
                .stream()
                .noneMatch(ShowSeat::isReserved);

        if (!allSeatsAvailable) {
            throw new SeatsNotAvailableException("All seats are not available. ");
        }

        // create a new booking
        // mark all seats as occupied
        // save the booking

        // release lock

        return null;
    }

    public Booking cancelBooking(Booking booking) {
        // check if the booking hasn't already been cancelled.
        // check if the show hasn't already taken place.

        // if the payment was done, then initiate refund

        return null;
    }

    public List<Booking> listCustomerBookings(User user) {
        return bookingRepository.getBookingByUser(user);
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
