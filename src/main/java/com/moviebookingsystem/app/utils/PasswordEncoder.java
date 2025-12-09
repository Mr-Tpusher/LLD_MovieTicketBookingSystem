package com.moviebookingsystem.app.utils;

public class PasswordEncoder {
    public String encode(String password) {
        return "encoded:" + password + ";salt";
    }
}
