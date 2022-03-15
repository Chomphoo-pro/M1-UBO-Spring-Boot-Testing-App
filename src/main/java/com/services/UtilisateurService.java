package com.services;

import com.dtos.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {
    /**
     * Save a Utilisateur
     */
    UtilisateurDto saveUtilisateur(UtilisateurDto UtilisateurDto);

    /**
     * Get a Utilisateur by it's login
     */
    UtilisateurDto getUtilisateurByLogin(String UtilisateurLogin);

    /**
     * Delete a Utilisateur by it's login
     */
    boolean deleteUtilisateur(String UtilisateurLogin);

    /**
     * Get all the Utilisateurs
     */
    List<UtilisateurDto> getAllUtilisateurs();


}
