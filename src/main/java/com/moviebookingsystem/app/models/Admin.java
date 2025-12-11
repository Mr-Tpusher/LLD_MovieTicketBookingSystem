package com.moviebookingsystem.app.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admins")
public class Admin extends Exposed {
    private String designation;
    private String phone;
    private int numberOfYearsAtTheCompany;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private User user;
}
