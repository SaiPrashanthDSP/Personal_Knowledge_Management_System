package com.pkms.Services.Implementation;

import com.pkms.Entity.User;
import com.pkms.Repository.UserRepository;
import com.pkms.Services.UserData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserDataServiceImpl implements UserData {
    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<User> getUserData(String userName) {
        return userRepository.findByUsername(userName);
    }
}
