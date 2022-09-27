package com.example.gam.controllers;

import com.example.gam.entities.NatureInfo;
import com.example.gam.entities.PerceptionSupportParution;
import com.example.gam.services.PerceptionSupParService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiperceptionsuppar")
public class PerceptionSupParRestController {



    private PerceptionSupParService perceptionSupParService;
    public PerceptionSupParRestController(PerceptionSupParService perceptionSupParService) {
        this.perceptionSupParService = perceptionSupParService;
    }

    @PostMapping
    public PerceptionSupportParution addNewPerceptionSupportParution(@RequestBody PerceptionSupportParution  perceptionSupportParution){
        return  perceptionSupParService.addNewPerceptionSupportParution(perceptionSupportParution);
    }

    @PutMapping("/{id}")
    public PerceptionSupportParution updatePerceptionSupportParution(@PathVariable("id") Long id, @RequestBody PerceptionSupportParution perceptionSupportParution){
        PerceptionSupportParution per=perceptionSupParService.getPerceptionSupportParutionById(id);
        per.setLibelle(perceptionSupportParution.getLibelle());
        per.setEn_libelle(perceptionSupportParution.getEn_libelle());

        return  perceptionSupParService.updatePerceptionSupportParution(perceptionSupportParution);
    }

    @GetMapping("/libelle/{libelle}")
    public  PerceptionSupportParution getPerceptionSupportParutionByLibelle(@PathVariable("libelle") String libelle){
        return perceptionSupParService.getPerceptionSupportParutionByLibelle(libelle);
    }

    @GetMapping
    public List<PerceptionSupportParution> getAllPerceptionSupportParution(){
        return perceptionSupParService.getAllPerceptionSupportParution();
    }
    @GetMapping("/{id}")
    public  PerceptionSupportParution getPerceptionSupportParutionById(@PathVariable("id") Long id){
        return  perceptionSupParService.getPerceptionSupportParutionById(id);
    }

    @DeleteMapping("/{id}")
    public void  deletePerceptionSupportParution(@PathVariable("id") Long id){
        perceptionSupParService.deletePerceptionSupportParutionById(id);
    }
}
