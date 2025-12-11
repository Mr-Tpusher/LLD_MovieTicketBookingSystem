package com.moviebookingsystem.app.models;

import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ShowSeat extends Exposed {
    @OneToOne
    private HallSeat hallSeat;
    private double price;
    private boolean isReserved;
}
