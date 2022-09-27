package com.example.gam.services;

import com.example.gam.entities.Abonnement;
import com.example.gam.entities.Utilisateur;

import javax.rmi.CORBA.Util;
import java.util.List;

public interface AbonnementService {

    public Abonnement addNewAbonnement(Abonnement abonnement);
    public Abonnement updateAbonnement(Abonnement abonnement);
    void deleteAbonnement(Long id);
   public  List<Abonnement> getALLAbonnement();
   public Abonnement getAbonnemntById(Long id);

   public Abonnement getAbonnementExpirer(Long iduser,String expirationdate);
}
