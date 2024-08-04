package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.LearningMaterial;

public interface LearningMaterialRepo extends JpaRepository<LearningMaterial,Long>
{
    
}