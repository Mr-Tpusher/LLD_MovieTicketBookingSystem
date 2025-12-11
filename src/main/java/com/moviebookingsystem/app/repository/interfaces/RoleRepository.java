package com.moviebookingsystem.app.repository.interfaces;

import com.moviebookingsystem.app.constants.UserRole;
import com.moviebookingsystem.app.models.Role;

import java.util.Optional;

public interface RoleRepository extends AbstractRepository<Role, Long> {
    Optional<Role> getRoleByName(String role);
}
