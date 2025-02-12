//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.when;
//
//
//@SpringBootTest
//public class UserServiceIntegraTest {
//
//    @MockitoBean
//    private UserRepository userRepository;
//
//    @Autowired
//    private UserService userService;
//
//    //    @Test
////    void testUserRegistered(){
////        userService.addUser("john");
////
////        assertTrue(userService.isUserRegistered("john"));
////    }
//    @Test
//    void testIsUserRegistered_WhenUserExists() {
//        when(userRepository.findByUsername("john")).thenReturn(Optional.of(new User()));
//
//        boolean result = userService.isUserRegistered("john");
//        assertTrue(result);
//
//    }
//
//    @Test
//    void testIsUserRegistered_WhenUserNotExists() {
//        when(userRepository.findByUsername("alice")).thenReturn(Optional.empty());
//
//        boolean result = userService.isUserRegistered("alice");
//        assertFalse(result);
//
//    }
//}
