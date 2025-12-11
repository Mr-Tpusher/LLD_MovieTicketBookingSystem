package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.constants.HallSeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hall_seats")
public class HallSeat extends Auditable {
    private String name;
    private HallSeatType hallSeatType;
}
