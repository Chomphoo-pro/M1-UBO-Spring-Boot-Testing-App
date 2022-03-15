package com.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data //Getters & Setters
@Entity
public class Creneau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date_heure;
    private Integer duree;

    @Enumerated(EnumType.STRING)
    private Status type;


    @OneToOne
    private Cours cours;

}