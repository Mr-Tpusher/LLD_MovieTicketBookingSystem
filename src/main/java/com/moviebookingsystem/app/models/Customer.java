package com.moviebookingsystem.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends Exposed {
    private String fullname;
    private String phone;
    private String email;
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    @OneToOne
    private User user;
}

