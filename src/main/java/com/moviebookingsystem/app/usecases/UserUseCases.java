package com.moviebookingsystem.app.usecases;

import com.moviebookingsystem.app.models.User;

public class UserUseCases {

    public boolean isPasswordValid(User user, String password) {
        return user.verifyPassword(password);
    }

    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }
}

