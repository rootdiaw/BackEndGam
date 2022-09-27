package com.example.gam.services;
import com.example.gam.entities.Utilisateur;
import com.example.gam.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;


    @Override
    public List<Utilisateur> getEmailAndPassword(String email, String password) {
        return utilisateurRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public Utilisateur addNewUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public Utilisateur getUtilisateurByTelephone(String telephone) {
        return utilisateurRepository.findByTelephone(telephone);
    }
}