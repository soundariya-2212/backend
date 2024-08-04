package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.Assignment;

public interface AssignmentRepo extends JpaRepository<Assignment,Long>{
    
}
