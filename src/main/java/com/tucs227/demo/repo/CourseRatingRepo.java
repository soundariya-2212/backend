package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.CourseRating;

public interface CourseRatingRepo extends JpaRepository<CourseRating,Long>{

    
}