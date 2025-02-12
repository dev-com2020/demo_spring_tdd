package com.example.demo;

import com.example.demo.service.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MockBeanTest {

    @MockitoBean
    private MessageService messageService;

    @Test
    void testMockitoBean(){
        when(messageService.getMessage()).thenReturn("Mockowana...");
        assertEquals("Mockowana...", messageService.getMessage());
    }
}
