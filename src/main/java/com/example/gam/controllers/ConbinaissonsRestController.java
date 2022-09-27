package com.example.gam.controllers;

import com.example.gam.entities.Conbinaissons;
import com.example.gam.services.ConbinaissonsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiconbinaissons")
public class ConbinaissonsRestController {

    private ConbinaissonsService conbinaissonsService;
   // private SousOptionService sousOptionService;

    public ConbinaissonsRestController(ConbinaissonsService conbinaissonsService) {
        super();
        this.conbinaissonsService = conbinaissonsService;
    }

    @GetMapping
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsService.getAllConbinaissons();
    }

    @GetMapping("/{id}")
    public  Conbinaissons getConbinaissonsById(@PathVariable("id") Long id){
        return conbinaissonsService.getConbinaissonsParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteConbinaissons(@PathVariable("id") Long id){

        conbinaissonsService.deleteConbinaissonsParId(id);

    }
    @PostMapping
    public Conbinaissons addConbinaissons(@RequestBody Conbinaissons conbinaissons){
        return conbinaissonsService.addNewConbinaissons(conbinaissons);
    }
    @PutMapping("/{id}")
    public Conbinaissons updateConbinaissons(@PathVariable("id") Long id, @RequestBody Conbinaissons conbinaissons){
        Conbinaissons conbinaissons1= conbinaissonsService.getConbinaissonsParId(id);
        //conbinaissons1.setNamefile(conbinaissons.getNamefile());
        conbinaissons1.setNatureInfo(conbinaissons.getNatureInfo());
        conbinaissons1.setRebondInfo(conbinaissons.getRebondInfo());
        conbinaissons1.setSupportParution(conbinaissons.getSupportParution());
        conbinaissons1.setPerceptionSupportParution(conbinaissons.getPerceptionSupportParution());
        conbinaissons1.setAction(conbinaissons.getAction());

        return conbinaissonsService.updateNewConbinaissons(conbinaissons);
    }

    /*@PostMapping("/name/file")
    public Conbinaissons getConbinaissonsNameFile(@RequestBody Conbinaissons conbinaisson){

         System.out.println("AAAAAAAAAAAAAAAAAAAA"+conbinaisson.toString());
        return conbinaissonsService.getConbinaissonsNamefile(conbinaisson.getNatureInfo().getIdnatureinfo(),
                conbinaisson.getRebondInfo().getIdrebondinfo(),conbinaisson.getSupportParution().getIdsupportparution(),
                conbinaisson.getPerceptionSupportParution().getIdperceptionsupportparution()
        );
    }*/

    @PostMapping("/action")
    public Conbinaissons getConbinaissonsAction(@RequestBody Conbinaissons conbinaisson){

        // System.out.println("AAAAAAAAAAAAAAAAAAAA"+conbinaisson.toString());
        return conbinaissonsService.getConbinaissonsAction(conbinaisson.getNatureInfo().getIdnatureinfo(),
                conbinaisson.getRebondInfo().getIdrebondinfo(),conbinaisson.getSupportParution().getIdsupportparution(),
                conbinaisson.getPerceptionSupportParution().getIdperceptionsupportparution()
        );
    }

}