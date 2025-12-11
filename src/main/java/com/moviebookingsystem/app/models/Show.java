package com.moviebookingsystem.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shows")
public class Show extends Exposed {

    @OneToOne
    private Movie movie;
    // store in utc
    private OffsetDateTime startTime;
    // store in utc
    private OffsetDateTime endTime;

    @OneToOne
    private Hall hall;

    private boolean isCancelled;

    public boolean canShowBeBooked() {
          return (!this.isCancelled && OffsetDateTime.now().isBefore(this.endTime));
    }
}
