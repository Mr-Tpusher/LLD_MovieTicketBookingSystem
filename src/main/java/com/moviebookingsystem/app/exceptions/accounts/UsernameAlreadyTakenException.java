package com.moviebookingsystem.app.exceptions.accounts;

public class UsernameAlreadyTakenException extends AccountsException {
    public UsernameAlreadyTakenException(String message) {
        super(message);
    }
}
