/*package com.example.gam.services;

import com.example.gam.entities.Option;
import com.example.gam.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private OptionRepository optionRepository;
    @Override
    public Option addNewOption(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public Option updateNewOption(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public List<Option> getAllOption() {
        return optionRepository.findAll();
    }

    @Override
    public Option getOptionParId(Long id) {
        return optionRepository.findById(id).get();
    }

    @Override
    public void deleteOptionParId(Long id) {
        optionRepository.deleteById(id);

    }
}
*/