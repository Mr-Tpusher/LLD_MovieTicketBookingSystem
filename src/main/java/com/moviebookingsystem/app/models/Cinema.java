package com.moviebookingsystem.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cinemas")
public class Cinema extends Exposed {
    private String name;
    private String city;
    private List<Hall> halls;
}
