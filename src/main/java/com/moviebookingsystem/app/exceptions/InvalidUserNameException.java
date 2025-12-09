package com.moviebookingsystem.app.exceptions;

public class InvalidUserNameException extends ValidationException {
    public InvalidUserNameException(String message) {
        super(message);
    }
}
