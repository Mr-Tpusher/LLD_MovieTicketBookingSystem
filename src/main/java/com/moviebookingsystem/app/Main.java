package com.moviebookingsystem.app;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Instant.now());

        OffsetDateTime utc = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(utc);
    }
}
