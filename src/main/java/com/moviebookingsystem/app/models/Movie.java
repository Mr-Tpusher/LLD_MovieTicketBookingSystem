package com.moviebookingsystem.app.models;
import com.moviebookingsystem.app.constants.MovieGenre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends Auditable {
    private String name;
    private MovieGenre genre;
    private int durationInMinutes;
}

