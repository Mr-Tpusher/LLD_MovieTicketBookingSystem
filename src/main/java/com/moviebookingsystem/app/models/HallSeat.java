package com.moviebookingsystem.app.models;

import com.moviebookingsystem.app.constants.HallSeatType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HallSeat extends Auditable {
    private String name;
    private HallSeatType hallSeatType;
}
