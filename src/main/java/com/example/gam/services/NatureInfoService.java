package com.example.gam.services;

import com.example.gam.entities.NatureInfo;

import java.util.List;

public interface NatureInfoService {
    NatureInfo addNewNatureInfo(NatureInfo natureInfo);
    NatureInfo updateNatureInfo(NatureInfo natureInfo);
    List<NatureInfo> getAllNatureInfo();
    NatureInfo getNatureInfoById(Long id);
    void deleteNatureInfo(Long id);
    NatureInfo getNatureInfoByLibelle(String libelle);
}
