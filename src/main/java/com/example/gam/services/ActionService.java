package com.example.gam.services;

import com.example.gam.entities.Action;

import java.util.List;

public interface ActionService {

    Action addNewAction(Action action);
    Action updateAction(Action action);
    List<Action> getAllAction();
    void deleteAction(Long id);
    Action getActionById(Long id);
}
