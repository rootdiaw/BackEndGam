package com.example.gam.services;

import com.example.gam.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {


    List<Utilisateur> getEmailAndPassword(String email, String password);
}
