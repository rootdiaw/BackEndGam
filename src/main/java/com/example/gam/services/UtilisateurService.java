package com.example.gam.services;

import com.example.gam.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {


    List<Utilisateur> getEmailAndPassword(String email, String password);

    public Utilisateur addNewUtilisateur(Utilisateur utilisateur);
    public  Utilisateur updateUtilisateur(Utilisateur utilisateur);
    public List<Utilisateur> getAllUtilisateur();
    void  deleteUtilisateur(Long id);
    public Utilisateur  getUtilisateurById(Long id);
    public  Utilisateur getUtilisateurByTelephone(String telephone);
}
