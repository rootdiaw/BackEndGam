package com.example.gam.services;

import com.example.gam.entities.RebondInfo;

import java.util.List;

public interface RebondInfoService {
    RebondInfo addNewRebondInfo(RebondInfo rebondInfo);
    RebondInfo updateRebondInfo(RebondInfo rebondInfo);
    List<RebondInfo> getAllRebondInfo();
    RebondInfo getRebondInfoById(Long id);
    void deleteRebondInfoById(Long id);
    RebondInfo getRebondInfoByLibelle(String libelle);

}
