package com.example.demo;//package com.example.demo;
//
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserService {
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public boolean isUserRegistered(String username) {
//        return userRepository.findByUsername(username).isPresent();
//    }
//}

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<String> users = new ArrayList<>();

    public void addUser(String username) {
        users.add(username);
    }

    public boolean containsUser(String username) {
        return users.contains(username);
    }
}