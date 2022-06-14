package com.example.gam.services;

import com.example.gam.entities.RebondInfo;
import com.example.gam.repository.RebondInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebondInfoServiceImpl implements RebondInfoService {

    @Autowired
    private RebondInfoRepository rebondInfoRepository;
    @Override
    public RebondInfo addNewRebondInfo(RebondInfo rebondInfo) {
        return rebondInfoRepository.save(rebondInfo);
    }

    @Override
    public RebondInfo updateRebondInfo(RebondInfo rebondInfo) {
        return rebondInfoRepository.save(rebondInfo);
    }

    @Override
    public List<RebondInfo> getAllRebondInfo() {
        return rebondInfoRepository.findAll();
    }

    @Override
    public RebondInfo getRebondInfoById(Long id) {
        return rebondInfoRepository.findById(id).get();
    }

    @Override
    public void deleteRebondInfoById(Long id) {
        rebondInfoRepository.deleteById(id);
    }

    @Override
    public RebondInfo getRebondInfoByLibelle(String libelle) {
        return rebondInfoRepository.findByLibelle(libelle);
    }
}
