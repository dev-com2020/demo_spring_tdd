package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ProcessTax {
    private double taxPercentage = 0.3;
    public double calculate(int income,int months) {
        return income*months*taxPercentage;
    }
}