package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Filiere_langue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeFiliereLangue;
    private String nomFiliereLangue;

    @OneToOne
    private Composante composante;

    @ManyToMany (mappedBy = "concerne")
    Set<Cours> filiere_langue;
}