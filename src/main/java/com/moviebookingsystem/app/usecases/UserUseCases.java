package com.moviebookingsystem.app.usecases;

import com.moviebookingsystem.app.dtos.CreateUserDTO;
import com.moviebookingsystem.app.models.User;
import com.moviebookingsystem.app.repository.interfaces.UserRepository;


public class UserUseCases {
    private final UserRepository userRepository;

    public UserUseCases(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createUser(CreateUserDTO createUserDTO) {
        // TODO -> check whether the username, phone , email is unique

        // Create User
        User user = new User(createUserDTO.getUsername(), createUserDTO.getPassword());

        // save the user
        userRepository.save(user);

        return user;
    }


    public boolean isPasswordValid(User user, String password) {
        return user.verifyPassword(password);
    }

    public void changePassword(User user, String newPassword) {
        user.updatePassword(newPassword);
    }
}

