package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.exceptions.InvalidUserNameException;
import com.moviebookingsystem.app.exceptions.PasswordTooSimpleException;
import com.moviebookingsystem.app.utils.PasswordUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


@Getter
@Entity
@Table(name = "users")
public class User extends Auditable {
    // authentication
    private String username;
    private String hashSaltedPassword;

    // authorization
    // @ManyToMany
    private Set<Role> roles;

    public User(String username, String password) {
        if (isUsernameValid(username)) {
            this.username = username;
        }

        if (isPasswordValid(password)) {
            this.hashSaltedPassword = hashSaltPassword(password);
        }

         roles = ConcurrentHashMap.newKeySet();
    }


    private boolean isUsernameValid(String username) {
        if (username.length() < 2) {
            throw new InvalidUserNameException("Username must have at least 2 characters.");
        }
        return true;
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            throw  new PasswordTooSimpleException("password must have at least 8 characters.");
        }
        return true;
    }

    public String hashSaltPassword(String plaintextPassword) {
        return PasswordUtil.hashPassword(plaintextPassword);
    }


    public boolean verifyPassword(String password) {
        // verify whether provided password matches the actual user password
        return PasswordUtil.verifyPassword(password, this.hashSaltedPassword);
    }

    public void updatePassword(String newPlainTextPassword) {
        if (isPasswordValid(newPlainTextPassword)) {
            this.hashSaltedPassword = hashSaltPassword(newPlainTextPassword);
        }
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }
}
