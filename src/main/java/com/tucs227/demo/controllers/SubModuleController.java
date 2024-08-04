package com.tucs227.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tucs227.demo.models.SubModule;
import com.tucs227.demo.services.SubModuleServices;

import java.util.List;

@RestController
@RequestMapping("/sub")
public class SubModuleController {

    @Autowired
    private SubModuleServices subModuleService;

    @GetMapping
    public List<SubModule> getAllSubModules() {
        return subModuleService.getAllSubModules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubModule> getSubModuleById(@PathVariable Long id) {
        return subModuleService.getSubModuleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SubModule createSubModule(@RequestBody SubModule subModule) {
        return subModuleService.createSubModule(subModule);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubModule> updateSubModule(@PathVariable Long id, @RequestBody SubModule subModule) {
        return subModuleService.updateSubModule(id, subModule)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubModule(@PathVariable Long id) {
        if (subModuleService.deleteSubModule(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
