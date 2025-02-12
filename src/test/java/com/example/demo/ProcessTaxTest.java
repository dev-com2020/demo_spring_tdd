package com.example.demo;

import com.example.demo.service.ProcessTax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessTaxTest {

    @InjectMocks
    ProcessTax processTax;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testTaxCalculation() {
    int income = 10;
    int months = 5;
    double totalTax = processTax.calculate(income,months);
    assertEquals(15.0,totalTax);
    }
}