package com.pkms.Services;

import com.pkms.Entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserData {
   Optional<User> getUserData(String userName);
}
