package com.moviebookingsystem.app.repository.interfaces;

import com.moviebookingsystem.app.models.User;

import java.util.Optional;

public interface UserRepository extends AbstractRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameOrEmailOrPhone(String username, String email, String password);

}
