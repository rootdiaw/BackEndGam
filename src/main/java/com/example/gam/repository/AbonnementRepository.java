package com.example.gam.repository;

import com.example.gam.entities.Abonnement;
import com.example.gam.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {

    //public  Abonnement findByUtilisateurAndExpirationdate(Utilisateur utilisateur, String expirationdate);
    @Query(value="select * from Abonnement " +
            "where utilisateur_idutilisateur=?1 and expirationdate=?2",nativeQuery = true)
    Abonnement getAbonnementUserAndExpirationdate(Long iduser, String expiration);
}
