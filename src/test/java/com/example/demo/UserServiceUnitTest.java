//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServiceUnitTest {
//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService;
//
//
//    @Test
//    void testIsUserRegistered_WhenUserExists() {
//        when(userRepository.findByUsername("john")).thenReturn(Optional.of(new User()));
//
//        boolean result = userService.isUserRegistered("john");
//        assertTrue(result);
//
//    }
//}
