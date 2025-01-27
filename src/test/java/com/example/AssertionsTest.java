package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates the use of various assertions in JUnit.
 */
public class AssertionsTest {

    @Test
    void testAssertions() {
        // Basic assertions
        assertEquals(4, 2 + 2, "2 + 2 should equal 4");
        assertNotEquals(5, 2 + 2, "2 + 2 should not equal 5");

        // Boolean assertions
        assertTrue(3 > 2, "3 should be greater than 2");
        assertFalse(2 > 3, "2 should not be greater than 3");

        // Null checks
        Object obj = null;
        assertNull(obj, "Object should be null");
        obj = new Object();
        assertNotNull(obj, "Object should not be null");

        // Exception testing
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        });
        assertEquals("/ by zero", exception.getMessage(), "Exception message should match");
    }
}
