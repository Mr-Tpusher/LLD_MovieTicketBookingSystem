package com.moviebookingsystem.app.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

    public static String hashPassword(String plaintTextPassword) {
/*
        String salt = BCrypt.gensalt();
        System.out.println("salt=" + salt);
        String hashedSaltedPassword =  BCrypt.hashpw(plaintTextPassword, salt);
        System.out.println("hashedsaltedPassword=" + hashedSaltedPassword);
        return hashedSaltedPassword;
*/
        return BCrypt.hashpw(plaintTextPassword, BCrypt.gensalt());
    }

    public static boolean verifyPassword(String providedPassword, String storedHashedSaltedPassword) {
        return BCrypt.checkpw(providedPassword, storedHashedSaltedPassword);
    }
}
