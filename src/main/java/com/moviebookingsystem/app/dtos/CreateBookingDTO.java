package com.moviebookingsystem.app.dtos;

import com.moviebookingsystem.app.models.Show;
import com.moviebookingsystem.app.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CreateBookingDTO {
    private Show show;
    private List<ShowSeat> showSeats;
}
