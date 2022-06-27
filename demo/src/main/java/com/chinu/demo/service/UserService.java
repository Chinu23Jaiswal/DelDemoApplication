package com.chinu.demo.service;

import com.chinu.demo.dto.Users;
import com.chinu.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users saveUser(Users user){
        userRepo.save(user);
        return user;
    }

    public Users getUser(Integer id){
        return userRepo.findById(id).get();
    }


}
