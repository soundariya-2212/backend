package com.tucs227.demo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
// import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Table(name = "user_details")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String name;
    private String email;
    private String password;
    private String role;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Course> courses;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Course> createdCourses;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<JwtToken> tokens;
   
    public User() {}

    public User(Long uid, String name, String email, String password, String role,List<Course>courses,List<Enrollment>enrollments,List<Course> createdCourses, List<JwtToken> tokens){
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.courses = courses;
        this.enrollments = enrollments;
        this.createdCourses = createdCourses;
        this.tokens = tokens;
    }

    
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Course> getCreatedCourses() {
        return createdCourses;
    }

    public void setCreatedCourses(List<Course> createdCourses) {
        this.createdCourses = createdCourses;
    }

    public List<JwtToken> getTokens() {
        return tokens;
    }

    public void setTokens(List<JwtToken> tokens) {
        this.tokens = tokens;
    }
}
