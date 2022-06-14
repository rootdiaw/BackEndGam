package com.example.gam.services;

import com.example.gam.entities.Action;
import com.example.gam.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionServiceImpl implements  ActionService {


    @Autowired
    private ActionRepository actionRepository;
    @Override
    public Action addNewAction(Action action) {
        return actionRepository.save(action);
    }

    @Override
    public Action updateAction(Action action) {
        return actionRepository.save(action);
    }

    @Override
    public List<Action> getAllAction() {
        return actionRepository.findAll();
    }

    @Override
    public void deleteAction(Long id) {
            actionRepository.deleteById(id);
    }

    @Override
    public Action getActionById(Long id) {
        return actionRepository.findById(id).get();
    }
}
