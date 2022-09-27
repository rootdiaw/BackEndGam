package com.example.gam.controllers;


import com.example.gam.entities.NatureInfo;
import com.example.gam.entities.RebondInfo;
import com.example.gam.services.NatureInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apinatureinfo")
public class NatureInfoRestController {



    private NatureInfoService natureInfoService;
    public NatureInfoRestController(NatureInfoService natureInfoService) {
        this.natureInfoService = natureInfoService;
    }


    @PostMapping
    public NatureInfo addNewNatureInfo(@RequestBody NatureInfo  natureInfo){
        return  natureInfoService.addNewNatureInfo(natureInfo);
    }

    @PutMapping("/{id}")
    public NatureInfo updateNatureInfo(@PathVariable("id") Long id, @RequestBody NatureInfo natureInfo){
        NatureInfo reb=natureInfoService.getNatureInfoById(id);
        reb.setLibelle(natureInfo.getLibelle());
        reb.setEn_libelle(natureInfo.getEn_libelle());

        return  natureInfoService.updateNatureInfo(natureInfo);
    }
    //RequestMapping(method = RequestMethod.GET, value = Routes.BLAH_GET + "/{blahName:.+}")
    //@GetMapping("/libelle/{libelle}")
    @RequestMapping(method = RequestMethod.GET, value="/libelle/{libelle:.+}")
    public  NatureInfo getNatureInfoByLibelle(@PathVariable("libelle") String libelle){
        return natureInfoService.getNatureInfoByLibelle(libelle);
    }

    @GetMapping
    public List<NatureInfo> getAllNatureInfo(){
        return natureInfoService.getAllNatureInfo();
    }
    @GetMapping("/{id}")
    public  NatureInfo getNatureInfoById(@PathVariable("id") Long id){
        return  natureInfoService.getNatureInfoById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteNatureInfo(@PathVariable("id") Long id){
        natureInfoService.deleteNatureInfo(id);
    }
}
