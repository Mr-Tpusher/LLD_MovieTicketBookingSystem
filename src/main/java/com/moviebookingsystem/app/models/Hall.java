package com.moviebookingsystem.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "halls")
public class Hall extends Exposed {
    private String name;
    private int seatCount;

    @OneToMany
    private List<HallSeat> hallSeats;
}
