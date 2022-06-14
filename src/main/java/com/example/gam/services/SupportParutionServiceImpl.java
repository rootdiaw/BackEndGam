package com.example.gam.services;

import com.example.gam.entities.SupportParution;
import com.example.gam.repository.SupportParutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportParutionServiceImpl implements  SupportParutionService {

    @Autowired
    private SupportParutionRepository supportParutionRepository;
    @Override
    public SupportParution addNewSupportParution(SupportParution supportParution) {
        return supportParutionRepository.save(supportParution);
    }

    @Override
    public SupportParution updateSupportParution(SupportParution supportParution) {
        return supportParutionRepository.save(supportParution);
    }

    @Override
    public List<SupportParution> getAllSupportParution() {
        return supportParutionRepository.findAll();
    }

    @Override
    public SupportParution getSupportParutionById(Long id) {
        return supportParutionRepository.findById(id).get();
    }

    @Override
    public void deleteSupportParutionById(Long id) {
        supportParutionRepository.deleteById(id);
    }

    @Override
    public SupportParution getSupportParutionByLibelle(String libelle) {
        return supportParutionRepository.findByLibelle(libelle);
    }
}
