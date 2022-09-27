package com.example.gam.controllers;

import com.example.gam.entities.RebondInfo;
import com.example.gam.entities.SupportParution;
import com.example.gam.services.SupportParutionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apisupprotparution")
public class SupportParutionRestController {

    private SupportParutionService supportParutionService;
    public SupportParutionRestController(SupportParutionService supportParutionService) {
        this.supportParutionService = supportParutionService;
    }

    @PostMapping
    public SupportParution addNewSupportParution(@RequestBody SupportParution  supportParution){
        return  supportParutionService.addNewSupportParution(supportParution);
    }

    @PutMapping("/{id}")
    public SupportParution updateSupportParution(@PathVariable("id") Long id, @RequestBody SupportParution supportParution){
        SupportParution sup=supportParutionService.getSupportParutionById(id);
        sup.setLibelle(supportParution.getLibelle());
        sup.setEn_libelle(supportParution.getEn_libelle());

        return  supportParutionService.updateSupportParution(supportParution);
    }

    @GetMapping("/libelle/{libelle}")
    public SupportParution getPerceptionSupportParutionByLibelle(@PathVariable("libelle") String libelle){
        return supportParutionService.getSupportParutionByLibelle(libelle);
    }
    @GetMapping
    public List<SupportParution> getAllSupportParution(){
       return supportParutionService.getAllSupportParution();
    }
    @GetMapping("/{id}")
    public  SupportParution getSupportParutionById(@PathVariable("id") Long id){
        return  supportParutionService.getSupportParutionById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteSupportParution(@PathVariable("id") Long id){
        supportParutionService.deleteSupportParutionById(id);
    }
}
