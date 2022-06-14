package com.example.gam.services;

import com.example.gam.entities.PerceptionSupportParution;
import com.example.gam.repository.PerceptionSupParRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerceptionSupParServiceImpl implements PerceptionSupParService {

    @Autowired
    private PerceptionSupParRepositry perceptionSupParRepositry;
    @Override
    public PerceptionSupportParution addNewPerceptionSupportParution(PerceptionSupportParution perceptionSupportParution) {
        return perceptionSupParRepositry.save(perceptionSupportParution);
    }

    @Override
    public PerceptionSupportParution updatePerceptionSupportParution(PerceptionSupportParution perceptionSupportParution) {
        return perceptionSupParRepositry.save(perceptionSupportParution);
    }

    @Override
    public List<PerceptionSupportParution> getAllPerceptionSupportParution() {
        return perceptionSupParRepositry.findAll();
    }

    @Override
    public PerceptionSupportParution getPerceptionSupportParutionById(Long id) {
        return perceptionSupParRepositry.findById(id).get();
    }

    @Override
    public void deletePerceptionSupportParutionById(Long id) {
            perceptionSupParRepositry.deleteById(id);
    }

    @Override
    public PerceptionSupportParution getPerceptionSupportParutionByLibelle(String libelle) {
        return perceptionSupParRepositry.findByLibelle(libelle);
    }
}
