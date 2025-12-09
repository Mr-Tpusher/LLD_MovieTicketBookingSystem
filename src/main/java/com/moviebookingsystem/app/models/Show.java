package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@Builder
public class Show extends Auditable {
    private Movie movie;
    // store in utc
    private Instant startTime;
    // store in utc
    private Instant endTime;

    private Hall hall;
}
