/*package com.example.gam.controllers;


import com.example.gam.entities.Gam;
import com.example.gam.services.GamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apigam")
public class GamController {


    private GamService gamService;
    public GamController(GamService gamService) {
        super();
        this.gamService = gamService;
    }
    @GetMapping
    public List<Gam> getAllGam()
    {
    return gamService.getAllGam();
    }
    @GetMapping("/id")
    public Gam getGamById(@PathVariable("id") Long id){
        return gamService.gamParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteGam(@PathVariable("id") Long id){
        gamService.deleteGamParId(id);
    }
    @PostMapping
    public Gam addGam(@RequestBody Gam gam){
        return gamService.addNewGam(gam);
    }

    @PutMapping("/{id}")
    public Gam updateGam(@PathVariable("id") Long id, @RequestBody Gam gam){
        Gam gam1=gamService.gamParId(id);
        gam1.setNatureinfo(gam.getNatureinfo());
        gam1.setSupprotparution(gam.getSupprotparution());
        gam1.setPerceptionsupportparution(gam.getPerceptionsupportparution());
        gam1.setRebondinfo(gam.getRebondinfo());

        return gamService.updateGam(gam);
    }
}*/
