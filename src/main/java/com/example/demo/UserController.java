package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/{username}")
//    public void addUser(@PathVariable String username){
//        userService.addUser(username);
//    }
    @GetMapping("/{username}")
    public boolean isUserRegistered(@PathVariable String username){
        return userService.isUserRegistered(username);
    }
}
