package com.example.gam.services;

import com.example.gam.entities.Conbinaissons;
import com.example.gam.repository.ConbinaissonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConbinaissonsServiceImpl implements ConbinaissonsService {
    @Autowired
    private ConbinaissonsRepository conbinaissonsRepository;
    @Override
    public Conbinaissons addNewConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public Conbinaissons updateNewConbinaissons(Conbinaissons conbinaissons) {
        return conbinaissonsRepository.save(conbinaissons);
    }

    @Override
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsRepository.findAll();
    }

    @Override
    public Conbinaissons getConbinaissonsParId(Long id) {
        return conbinaissonsRepository.findById(id).get();
    }

    @Override
    public void deleteConbinaissonsParId(Long id) {
        conbinaissonsRepository.deleteById(id);
    }

    @Override
    public Conbinaissons getConbinaissonsNamefile(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
                                                  Long idperceptionsupportparution) {
        return conbinaissonsRepository.getConbinaissonNamefile(idnatureinfo,idrebondinfo,
                idsupportparution,idperceptionsupportparution);
    }

    @Override
    public Conbinaissons getConbinaissonsAction(Long idnatureinfo, Long idrebondinfo, Long idsupportparution,
                                                Long idperceptionsupportparution) {
        return conbinaissonsRepository.getConbinaissonCalltoAction(idnatureinfo,idrebondinfo,
                idsupportparution,idperceptionsupportparution);
    }

}
