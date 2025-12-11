package com.moviebookingsystem.app.exceptions.accounts;

import com.moviebookingsystem.app.exceptions.TicketBookingSystemException;

public class SeatNotAvailableException extends TicketBookingSystemException {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}
