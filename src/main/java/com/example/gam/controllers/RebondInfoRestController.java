package com.example.gam.controllers;

import com.example.gam.entities.PerceptionSupportParution;
import com.example.gam.entities.RebondInfo;
import com.example.gam.services.RebondInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apirebondinfo")
public class RebondInfoRestController {

    private RebondInfoService rebondInfoService;
    public RebondInfoRestController(RebondInfoService rebondInfoService) {
        this.rebondInfoService = rebondInfoService;
    }

    @PostMapping
    public RebondInfo addNewRebondInfo(@RequestBody RebondInfo  rebondInfo){
        return  rebondInfoService.addNewRebondInfo(rebondInfo);
    }

    @PutMapping("/{id}")
    public RebondInfo updateRebondInfo(@PathVariable("id") Long id, @RequestBody RebondInfo rebondInfo){
        RebondInfo reb=rebondInfoService.getRebondInfoById(id);
        reb.setLibelle(rebondInfo.getLibelle());
        reb.setEn_libelle(rebondInfo.getEn_libelle());

        return  rebondInfoService.updateRebondInfo(rebondInfo);
    }
    @GetMapping("/libelle/{libelle}")
    public RebondInfo getPerceptionSupportParutionByLibelle(@PathVariable("libelle") String libelle){
        return rebondInfoService.getRebondInfoByLibelle(libelle);
    }

    @GetMapping
    public List<RebondInfo> getAllRebondInfo(){
        return rebondInfoService.getAllRebondInfo();
    }
    @GetMapping("/{id}")
    public  RebondInfo getRebondInfoById(@PathVariable("id") Long id){
        return  rebondInfoService.getRebondInfoById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteRebondInfo(@PathVariable("id") Long id){
        rebondInfoService.deleteRebondInfoById(id);
    }
}
