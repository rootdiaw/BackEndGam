package com.example.gam.services;

import com.example.gam.entities.NatureInfo;
import com.example.gam.repository.NatureInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NatureInfoServiceImpl  implements  NatureInfoService{

    @Autowired
    private NatureInfoRepository natureInfoRepository;
    @Override
    public NatureInfo addNewNatureInfo(NatureInfo natureInfo) {
        return natureInfoRepository.save(natureInfo);
    }

    @Override
    public NatureInfo updateNatureInfo(NatureInfo natureInfo) {
        return natureInfoRepository.save(natureInfo);
    }

    @Override
    public List<NatureInfo> getAllNatureInfo() {
        return natureInfoRepository.findAll();
    }

    @Override
    public NatureInfo getNatureInfoById(Long id) {
        return natureInfoRepository.findById(id).get();
    }

    @Override
    public void deleteNatureInfo(Long id) {
            natureInfoRepository.deleteById(id);
    }

    @Override
    public NatureInfo getNatureInfoByLibelle(String libelle) {
        return natureInfoRepository.findByLibelle(libelle);
    }
}
