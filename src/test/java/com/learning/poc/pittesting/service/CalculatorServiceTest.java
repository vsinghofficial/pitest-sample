package com.learning.poc.pittesting.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService= new CalculatorService();

    @Test
    void subtract() {
        Assertions.assertEquals(12,  calculatorService.subtract(12, 0));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(12,  calculatorService.multiply(12, 1));
    }

//    @Test
//    void subtract_improved() {
//        Assertions.assertEquals(10, calculatorService.subtract(12, 2));
//    }
//
//    @Test
//    void multiply_improved() {
//        Assertions.assertEquals(24, calculatorService.multiply(12, 2));
//    }
}