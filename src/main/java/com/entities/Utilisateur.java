package com.entities;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    private String login;
    private String prenom;
    private String nom;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private Gestionnaire gestionnaire;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private Vacataire vacataire;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private Responsable responsable;

}
