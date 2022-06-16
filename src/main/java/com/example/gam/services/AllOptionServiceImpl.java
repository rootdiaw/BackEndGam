package com.example.gam.services;


import com.example.gam.entities.NatureInfo;
import com.example.gam.repository.NatureInfoRepository;
import com.example.gam.repository.PerceptionSupParRepositry;
import com.example.gam.repository.RebondInfoRepository;
import com.example.gam.repository.SupportParutionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AllOptionServiceImpl implements AllOptionService {

    @Autowired
    private NatureInfoRepository natureInfoRepository;
    @Autowired
    private RebondInfoRepository rebondInfoRepository;
    @Autowired
    private SupportParutionRepository supportParutionRepository;
    @Autowired
    private PerceptionSupParRepositry perceptionSupParRepositry;

    @Override
    public Map<String, Object> getAllOption() {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("natureInfo",natureInfoRepository.findAll());
        map.put("rebondInfo",rebondInfoRepository.findAll());
        map.put("supportParution",supportParutionRepository.findAll());
        map.put("perceptionSupportParution",perceptionSupParRepositry.findAll());


       /* ArrayList<Object> arrayOfDifferentObject = new ArrayList<Object>();

        arrayOfDifferentObject.addAll(natureInfoRepository.findAll());
        arrayOfDifferentObject.addAll(rebondInfoRepository.findAll());
        arrayOfDifferentObject.addAll(supportParutionRepository.findAll());
        arrayOfDifferentObject.addAll(perceptionSupParRepositry.findAll());
        return  arrayOfDifferentObject;*/

       return map;

    }
}
