package com.moviebookingsystem.app.repository.interfaces;

import java.util.List;
import java.util.Optional;

public interface AbstractRepository<Entity, Id> {

    void save(Entity entity);

    Optional<Entity> findById(Id id);

    void delete(Entity entity);

    List<Entity> findAll();

    List<Entity> findByName();
}
