package com.tucs227.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tucs227.demo.models.SubModule;
import com.tucs227.demo.repo.SubModuleRepo;

import java.util.List;
import java.util.Optional;

@Service
public class SubModuleServices {

    @Autowired
    private SubModuleRepo subModuleRepository;

    public List<SubModule> getAllSubModules() {
        return subModuleRepository.findAll();
    }

    public Optional<SubModule> getSubModuleById(Long id) {
        return subModuleRepository.findById(id);
    }

    public SubModule createSubModule(SubModule subModule) {
        return subModuleRepository.save(subModule);
    }

    public Optional<SubModule> updateSubModule(Long id, SubModule subModule) {
        if (subModuleRepository.existsById(id)) {
            subModule.setId(id);
            return Optional.of(subModuleRepository.save(subModule));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteSubModule(Long id) {
        if (subModuleRepository.existsById(id)) {
            subModuleRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
