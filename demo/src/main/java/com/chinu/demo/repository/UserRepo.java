package com.chinu.demo.repository;

import com.chinu.demo.dto.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

}
