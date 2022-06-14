package com.example.gam.controllers;


import com.example.gam.entities.Utilisateur;
import com.example.gam.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiutilisateur")
public class UtilisateurRestController {


    private UtilisateurService utilisateurService;

    public UtilisateurRestController(UtilisateurService utilisateurService) {
        super();
        this.utilisateurService = utilisateurService;
    }

    @PostMapping(path="/auth")
    public List<Utilisateur> getEmailAndPassword(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.getEmailAndPassword(utilisateur.getEmail(),utilisateur.getPassword());
    }
}
