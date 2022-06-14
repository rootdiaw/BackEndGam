package com.example.gam.services;

import com.example.gam.entities.PerceptionSupportParution;

import java.util.List;

public interface PerceptionSupParService {

    PerceptionSupportParution addNewPerceptionSupportParution(PerceptionSupportParution perceptionSupportParution);
    PerceptionSupportParution updatePerceptionSupportParution(PerceptionSupportParution perceptionSupportParution);
    List<PerceptionSupportParution> getAllPerceptionSupportParution();
    PerceptionSupportParution getPerceptionSupportParutionById(Long id);
    void deletePerceptionSupportParutionById(Long id);
    PerceptionSupportParution getPerceptionSupportParutionByLibelle(String libelle);
}
