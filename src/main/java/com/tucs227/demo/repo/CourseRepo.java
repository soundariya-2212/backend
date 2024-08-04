package com.tucs227.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tucs227.demo.models.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
