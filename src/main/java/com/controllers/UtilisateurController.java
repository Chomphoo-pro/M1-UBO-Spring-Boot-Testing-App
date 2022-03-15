package com.controllers;

import com.dtos.UtilisateurDto;
import org.springframework.web.bind.annotation.*;

import com.services.impl.UtilisateurServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurServiceImpl UtilisateurService;

    public UtilisateurController(UtilisateurServiceImpl UtilisateurService) {
        this.UtilisateurService = UtilisateurService;
    }

    /**
     * Create a new Utilisateurs in the system
     */
    @PostMapping
    public UtilisateurDto saveUtilisateur(final @RequestBody UtilisateurDto UtilisateurDto){

        return UtilisateurService.saveUtilisateur(UtilisateurDto);
    }

    /**
     * Delete a Utilisateurs by it's login
     */
    @DeleteMapping("/{login}")
    public Boolean deleteUtilisateurs(@PathVariable String login){
        return UtilisateurService.deleteUtilisateur(login);
    }


    /**
     * <p>Get all Utilisateurss in the system</p>
     * @return List<UtilisateursDto>
     */
    @GetMapping
    public List<UtilisateurDto> getUtilisateurs() {
        return UtilisateurService.getAllUtilisateurs();
    }
}