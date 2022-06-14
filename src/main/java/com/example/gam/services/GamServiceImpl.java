/*package com.example.gam.services;

import com.example.gam.entities.Gam;
import com.example.gam.repository.GamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamServiceImpl implements GamService {

    @Autowired
    private GamRepository gamRepository;
    @Override
    public Gam addNewGam(Gam gam) {
        return gamRepository.save(gam);
    }

    @Override
    public Gam updateGam(Gam gam) {
        return gamRepository.save(gam);
    }

    @Override
    public List<Gam> getAllGam() {
        return gamRepository.findAll();
    }

    @Override
    public Gam gamParId(Long id) {
        return gamRepository.findById(id).get();
    }

    @Override
    public void deleteGamParId(Long id) {
        gamRepository.deleteById(id);

    }
}
*/