package com.entities;

import javax.persistence.*;

@Entity
public class Responsable {
    @Id
    private String login;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "login")
    @MapsId
    private Utilisateur utilisateur;

    @OneToOne
    private Composante composante;
}