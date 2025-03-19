package com.github.BrianChicas.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    @DisplayName("Test For Simple Addition")
    void testAdd() {
        assertEquals(4, calculator.add(1, 2), "Adds 1 and 2");
        assertEquals(-2, calculator.add(-4, 2), "Adds a negative numbers");
    }

    @Test
    @DisplayName("Test For Simple Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "4 minus 2");
        assertEquals(4, calculator.subtract(5, 1), "5 minus 1");
    }

    @Test
    @DisplayName("Test For Simple Division")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "4 divide 2");
        assertEquals(5, calculator.divide(5, 1), "5 divide 1");
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test For Simple Multiplication")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 times 3");
        assertEquals(-8, calculator.multiply(-4, 2), "-4 times 2");
    }

    @Test
    @DisplayName("Test For Fibonacci Sequence")
    void testFibonacci() {
        assertEquals(0, calculator.fibonacci(0), "Fibonacci of 0");
        assertEquals(1, calculator.fibonacci(1), "Fibonacci of 1");
        assertEquals(21, calculator.fibonacci(8), "Fibonacci of 8");
    }

    @Test
    @DisplayName("Fibonacci should throw IllegalArgumentException for negative input")
    void testFibonacciNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.fibonacci(-5));
        assertEquals("Input cannot be negative", exception.getMessage());
    }

}//end CalculatorTest
