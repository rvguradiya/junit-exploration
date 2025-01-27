package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates testing exceptions in JUnit.
 */
public class ExceptionTest {

    @Test
    void testArithmeticException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
        assertEquals("/ by zero", exception.getMessage(), "Exception message should match");
    }

    @Test
    void testNullPointerException() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            String str = null;
            str.length();
        });
        assertNotNull(exception, "Exception should not be null");
    }

    @Test
    void testCustomException() {
        class CustomException extends Exception {
            public CustomException(String message) {
                super(message);
            }
        }

        CustomException exception = assertThrows(CustomException.class, () -> {
            throw new CustomException("This is a custom exception");
        });
        assertEquals("This is a custom exception", exception.getMessage(), "Custom exception message should match");
    }
}
