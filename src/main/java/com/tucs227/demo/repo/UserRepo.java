package com.tucs227.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tucs227.demo.models.User;

public interface UserRepo extends JpaRepository<User,Long>{  


}
