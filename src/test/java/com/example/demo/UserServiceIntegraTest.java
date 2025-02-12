package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class UserServiceIntegraTest {
    @Autowired
    private UserService userService;

    @Test
    void testUserRegistered(){
        userService.addUser("john");

        assertTrue(userService.isUserRegistered("john"));
    }
}
