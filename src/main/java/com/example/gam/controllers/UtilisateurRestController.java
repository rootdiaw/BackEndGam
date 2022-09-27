package com.example.gam.controllers;


import com.example.gam.entities.Utilisateur;
import com.example.gam.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
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

    @PostMapping
    public Utilisateur addUtilisateur(@RequestBody Utilisateur utilisateur){
        return  utilisateurService.addNewUtilisateur(utilisateur);
    }

    @GetMapping
    public   List<Utilisateur> getAllUtilisateur(){
        return utilisateurService.getAllUtilisateur();
    }
    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable("id") Long id){
            return  utilisateurService.getUtilisateurById(id);
    }
    @GetMapping("/userbytel/{telephone}")
    public Utilisateur getUtilisateurByTelephone(@PathVariable("telephone") String telephone){
        return  utilisateurService.getUtilisateurByTelephone(telephone);
    }

    @DeleteMapping("/{id}")
    public void DeleteUtilisateurById(@PathVariable("id") Long id){
        utilisateurService.deleteUtilisateur(id);
    }

    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur){
        Utilisateur user=utilisateurService.getUtilisateurById(id);

        user.setNom(utilisateur.getNom());
        user.setPrenom(utilisateur.getPrenom());
        user.setTelephone(utilisateur.getTelephone());

        return  utilisateurService.updateUtilisateur(utilisateur);
    }

}
