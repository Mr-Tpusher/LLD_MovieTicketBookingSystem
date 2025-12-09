package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Builder
public class Cinema extends Auditable {
    private String name;
    private String city;
    private List<Hall> halls;
}
