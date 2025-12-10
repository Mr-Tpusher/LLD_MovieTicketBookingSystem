package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Customer extends Auditable {
    private String name;
    private String phone;
    private String email;
    private String city;

    private User user;
}

