package com.moviebookingsystem.app.exceptions;

public class InvalidCustomerIdException extends TicketBookingSystemException {
    public InvalidCustomerIdException(String message) {
        super(message);
    }
}
