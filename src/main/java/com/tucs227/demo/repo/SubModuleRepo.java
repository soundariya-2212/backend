package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.SubModule;

public interface SubModuleRepo extends JpaRepository<SubModule,Long>{
    
}
