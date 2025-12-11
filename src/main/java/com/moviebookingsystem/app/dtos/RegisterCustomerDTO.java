package com.moviebookingsystem.app.dtos;

import lombok.Data;

@Data
public class CustomerRegistrationDTO {
    private String username;
    private String password;
    private String fullname;
    private String phone;
    private String email;
    private String city;
}
