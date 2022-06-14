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
}