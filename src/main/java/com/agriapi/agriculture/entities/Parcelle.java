package com.agriapi.agriculture.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Parcelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long        id;

    @NotNull
    private Integer     surface;

    @OneToMany
    private Set<Culture> cultures = new HashSet<>();

    public Integer getSurface() {
        return surface;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public Set<Culture> getCultures() {
        return cultures;
    }

    public void setCultures(Set<Culture> cultures) {
        this.cultures = cultures;
    }
}
