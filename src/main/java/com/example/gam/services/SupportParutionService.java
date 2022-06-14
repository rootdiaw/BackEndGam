package com.example.gam.services;

import com.example.gam.entities.SupportParution;

import java.util.List;

public interface SupportParutionService {
    SupportParution addNewSupportParution(SupportParution supportParution);
    SupportParution updateSupportParution(SupportParution supportParution);
    List<SupportParution> getAllSupportParution();
    SupportParution getSupportParutionById(Long id);
    void deleteSupportParutionById(Long id);
    SupportParution getSupportParutionByLibelle(String libelle);

}
