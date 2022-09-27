package com.example.gam.controllers;
import com.example.gam.entities.Action;
import com.example.gam.entities.Conbinaissons;
import com.example.gam.services.ActionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiaction")
public class ActionRestController {

    private ActionService actionService;

    public ActionRestController(ActionService actionService) {
        super();
        this.actionService = actionService;
    }

    @GetMapping
    public List<Action> getAllAction() {
        return actionService.getAllAction();
    }

    @GetMapping("/{id}")
    public  Action getActionById(@PathVariable("id") Long id){
        return actionService.getActionById(id);
    }

    @DeleteMapping("/{id}")
    public void DeleteAction(@PathVariable("id") Long id){
        actionService.deleteAction(id);
    }

    @PostMapping
    public Action addConbinaissons(@RequestBody Action action){
        return actionService.addNewAction(action);
    }

    @PutMapping("/{id}")
    public Action updateConbinaissons(@PathVariable("id") Long id, @RequestBody Action action){
        Action act= actionService.getActionById(id);
        act.setLibelle(action.getLibelle());
        act.setEn_libelle(action.getEn_libelle());

        return actionService.updateAction(action);
    }
}
