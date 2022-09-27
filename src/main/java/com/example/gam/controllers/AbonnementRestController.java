package com.example.gam.controllers;


import com.example.gam.entities.Abonnement;
import com.example.gam.services.AbonnementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiabonnement")
public class AbonnementRestController {



    private AbonnementService abonnementService;

    public AbonnementRestController(AbonnementService abonnementService) {
        super();
        this.abonnementService = abonnementService;
    }
    @GetMapping
    public List<Abonnement> getAllabonnement(){
        return abonnementService.getALLAbonnement();
    }
    @GetMapping("/{id}")
    public Abonnement getAbonnementById(@PathVariable("id") Long id){
        return abonnementService.getAbonnemntById(id);
    }

    @PostMapping("/usersandexpiration")
    public Abonnement getAbonnementByUserAndExpiration(@RequestBody Abonnement abonnement){

        //System.out.println("AAAAAAAAAAAAAAAAAAAA"+abonnement.toString());
        return abonnementService.getAbonnementExpirer(abonnement.getUtilisateur().getIdutilisateur(),abonnement.getExpirationdate());
    }

    @PostMapping
    public  Abonnement addAbonnement(@RequestBody Abonnement abonnement){

        return abonnementService.addNewAbonnement(abonnement);
    }
    @DeleteMapping("/{id}")
    public void DeleteAbonnement(@PathVariable("id") Long id){
        abonnementService.deleteAbonnement(id);
    }

    @PutMapping("/{id}")
    public Abonnement updateAbonnement(@PathVariable("id") Long id, @RequestBody Abonnement abonnement){

        Abonnement abonnement1=abonnementService.getAbonnemntById(id);
        abonnement1.setAchatdate(abonnement.getAchatdate());
        abonnement1.setExpirationdate(abonnement.getExpirationdate());

        return abonnementService.updateAbonnement(abonnement);
    }

}
