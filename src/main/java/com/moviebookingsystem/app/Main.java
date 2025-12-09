package com.moviebookingsystem.app;

import com.moviebookingsystem.app.utils.PasswordUtil;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Instant.now());

        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(utc);

        System.out.println("------------------");

        PasswordUtil.hashPassword("Turing");
        PasswordUtil.hashPassword("Alan");
        PasswordUtil.hashPassword("dfldjfksdfjdfdsljf");
    }
}
