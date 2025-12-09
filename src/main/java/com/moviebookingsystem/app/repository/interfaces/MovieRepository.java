package com.moviebookingsystem.app.repository.interfaces;

import com.moviebookingsystem.app.models.Movie;

import java.util.List;

public interface MovieRepository extends AbstractRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
