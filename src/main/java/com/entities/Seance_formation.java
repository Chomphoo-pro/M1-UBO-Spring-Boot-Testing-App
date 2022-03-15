package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Seance_formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estEffectue;
    private Integer dureeEffective;
    private Boolean valide;
    private String commentaire;

    @OneToOne
    private Vacataire vacataire;

    @OneToOne
    private Creneau creneau;

}