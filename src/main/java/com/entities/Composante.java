package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data //Getters & Setters
@Entity
public class Composante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomComposante;
/*
    @OneToMany
    private List<Responsable> responsables = new ArrayList<>();

    @OneToMany
    private List<Filiere_langue> filiere_langues = new ArrayList<>();
*/
}
