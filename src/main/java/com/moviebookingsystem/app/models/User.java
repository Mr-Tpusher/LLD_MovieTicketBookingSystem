package com.moviebookingsystem.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Builder
public class User extends Auditable {
    // authentication
    private String username;
    private String hashSaltedPassword;

    // authorization
    private Set <Role> roles;

}
