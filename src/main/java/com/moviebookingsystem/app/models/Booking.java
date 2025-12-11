package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.constants.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bookings")
public class Booking extends Exposed {
    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> seats;

    private BookingStatus bookingStatus;

}
