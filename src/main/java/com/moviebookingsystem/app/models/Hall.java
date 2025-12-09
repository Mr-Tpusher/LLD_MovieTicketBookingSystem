package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Builder
public class Hall extends Auditable {
    private String name;
    private int seatCount;
    private List<HallSeat> hallSeats;
}
