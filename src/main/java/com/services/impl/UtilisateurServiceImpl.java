package com.services.impl;

import com.dtos.UtilisateurDto;
import com.entities.Utilisateur;
import com.repositories.UtilisateurRepository;
import com.services.UtilisateurService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("UtilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository UtilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository UtilisateurRepository){
        this.UtilisateurRepository = UtilisateurRepository;
    }

    @Override
    public UtilisateurDto saveUtilisateur(UtilisateurDto UtilisateurDto) {
        // Converts the dto to the Utilisateur entity
        Utilisateur Utilisateur = UtilisateurDtoToEntity(UtilisateurDto);
        // Save the Utilisateur entity
        Utilisateur = UtilisateurRepository.save(Utilisateur);
        // Return the new dto
        return UtilisateurEntityToDto(Utilisateur);
    }

    @Override
    public UtilisateurDto getUtilisateurByLogin(String UtilisateurLogin) {
        Utilisateur Utilisateur = UtilisateurRepository.findById(UtilisateurLogin).orElseThrow(() -> new EntityNotFoundException("Utilisateur not found"));
        return UtilisateurEntityToDto(Utilisateur);
    }

    @Override
    public boolean deleteUtilisateur(String UtilisateurLogin) {
        UtilisateurRepository.deleteById(UtilisateurLogin);
        return true;
    }

    @Override
    public List<UtilisateurDto> getAllUtilisateurs() {
        List<UtilisateurDto> UtilisateurDtos = new ArrayList<>();
        List<Utilisateur> Utilisateurs = UtilisateurRepository.findAll();
        Utilisateurs.forEach(Utilisateur -> {
            UtilisateurDtos.add(UtilisateurEntityToDto(Utilisateur));
        });
        return UtilisateurDtos;
    }

    /**
     * Map Utilisateur dto to Utilisateur entity use for get
     */
    private UtilisateurDto UtilisateurEntityToDto(Utilisateur Utilisateur){
        UtilisateurDto UtilisateurDto = new UtilisateurDto();
        UtilisateurDto.setLogin(Utilisateur.getLogin());
        UtilisateurDto.setPrenom(Utilisateur.getPrenom());
        UtilisateurDto.setNom(Utilisateur.getNom());
        return UtilisateurDto;
    }

    /**
     * Map Utilisateur entity to Utilisateur dto use for save
     */
    private Utilisateur UtilisateurDtoToEntity(UtilisateurDto UtilisateurDto){
        Utilisateur Utilisateur = new Utilisateur();
        Utilisateur.setLogin(UtilisateurDto.getLogin());
        Utilisateur.setPrenom(UtilisateurDto.getPrenom());
        Utilisateur.setNom(UtilisateurDto.getNom());
        return Utilisateur;
    }
}
