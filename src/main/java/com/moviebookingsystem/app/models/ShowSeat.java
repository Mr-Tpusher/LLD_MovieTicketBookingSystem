package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ShowSeat extends Auditable {
    private HallSeat hallSeat;
    private double price;
    private boolean isReserved;
}
