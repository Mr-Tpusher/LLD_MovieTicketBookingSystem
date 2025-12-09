package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.exceptions.InvalidUserNameException;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Builder
public class User extends Auditable {
    // authentication
    private String username;
    private String hashSaltedPassword;

    // authorization
    private Set <Role> roles;


    public void setUsername(String username) {
        if (username.length() < 2) {
            throw new InvalidUserNameException("Username must have at least 2 chars.");
        }
        this.username = username;
    }
}
