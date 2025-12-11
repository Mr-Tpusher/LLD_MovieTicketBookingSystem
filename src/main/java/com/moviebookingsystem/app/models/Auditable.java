package com.moviebookingsystem.app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @Column(columnDefinition = "TIMESTAMPTZ")
    @CreatedDate
    private Instant createAt;

    @Column(columnDefinition = "TIMESTAMPTZ")
    @LastModifiedDate
    private Instant updatedAt;

    @Column(columnDefinition = "TIMESTAMPTZ")
    private Instant deletedAt;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Auditable auditable)) return false;
        return id == auditable.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
