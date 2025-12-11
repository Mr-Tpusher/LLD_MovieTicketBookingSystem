package com.moviebookingsystem.app.models;
import com.moviebookingsystem.app.constants.MovieGenre;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie extends Exposed {
    private String name;
    private MovieGenre genre;
    private int durationInMinutes;
}

