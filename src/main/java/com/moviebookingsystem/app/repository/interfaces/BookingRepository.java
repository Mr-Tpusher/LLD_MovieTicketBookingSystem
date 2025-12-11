package com.moviebookingsystem.app.repository.interfaces;

import com.moviebookingsystem.app.models.Booking;
import com.moviebookingsystem.app.models.User;

import java.util.List;

public interface BookingRepository extends AbstractRepository<Booking, Long> {
    List<Booking> getBookingByUser(User user);
}
