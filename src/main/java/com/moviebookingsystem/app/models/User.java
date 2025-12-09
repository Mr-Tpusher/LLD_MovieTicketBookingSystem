package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.exceptions.InvalidUserNameException;
import com.moviebookingsystem.app.exceptions.PasswordTooSimpleException;
import com.moviebookingsystem.app.utils.PasswordUtil;
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
            throw new InvalidUserNameException("Username must have at least 2 characters.");
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw  new PasswordTooSimpleException("password must have at least 8 characters.");
        }

        this.hashSaltedPassword = PasswordUtil.hashPassword(password);
    }


    public boolean verifyPassword(String password) {
        // verify whether provided password matches the actual user password
        return PasswordUtil.verifyPassword(password, this.hashSaltedPassword);
    }
}
