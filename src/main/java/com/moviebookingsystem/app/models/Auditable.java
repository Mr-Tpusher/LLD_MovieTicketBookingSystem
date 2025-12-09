package com.moviebookingsystem.app.models;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public abstract class Auditable {
    private long  id;
    private Date createAt;
    private Date updatedAt;
    private Date deletedAt;

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
