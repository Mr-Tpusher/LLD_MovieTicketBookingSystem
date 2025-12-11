package com.moviebookingsystem.app.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateUserDTO {
    private String username;
    private String password;
}
