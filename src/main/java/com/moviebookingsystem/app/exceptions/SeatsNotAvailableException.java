package com.moviebookingsystem.app.exceptions;

public class SeatsNotAvailableException extends TicketBookingSystemException {

    public SeatsNotAvailableException(String message) {
        super(message);
    }
}
