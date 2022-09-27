package com.example.gam.services;

import com.example.gam.entities.Abonnement;
import com.example.gam.entities.Utilisateur;
import com.example.gam.repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbonnementServiceImpl implements AbonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement addNewAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void deleteAbonnement(Long id) {
        abonnementRepository.deleteById(id);
    }

    @Override
    public List<Abonnement> getALLAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement getAbonnemntById(Long id) {
        return abonnementRepository.findById(id).get();
    }

    @Override
    public Abonnement getAbonnementExpirer(Long iduser, String expirationdate) {
        return abonnementRepository.getAbonnementUserAndExpirationdate(iduser,expirationdate);
    }
}
