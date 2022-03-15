package com.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data //Getters & Setters
@Entity
public class Cours {
    @Id
    private Integer id;
    private String intitule;

    @ManyToMany
    Set<Filiere_langue> concerne;

}