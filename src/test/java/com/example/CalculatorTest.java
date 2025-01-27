package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-3, calculator.subtract(-2, 1), "-2 - 1 should equal -3");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 should equal 0");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-2, calculator.multiply(-2, 1), "-2 * 1 should equal -2");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should equal -2");

        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
