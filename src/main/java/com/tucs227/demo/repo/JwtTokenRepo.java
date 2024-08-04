package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.JwtToken;

public interface JwtTokenRepo extends JpaRepository<JwtToken,Long>{

    
}