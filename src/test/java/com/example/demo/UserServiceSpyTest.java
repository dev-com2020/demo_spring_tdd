package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceSpyTest {

    @MockitoSpyBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void testIsUserInRepo() {

        doReturn(Optional.of(new User())).when(userRepository).findByUsername("john");
        boolean result = userService.isUserRegistered("john");
        assertTrue(result);

    }
}
