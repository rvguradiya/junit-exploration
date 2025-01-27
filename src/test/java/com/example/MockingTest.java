package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
//import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Demonstrates the use of mocking in JUnit with Mockito.
 */
public class MockingTest {

    @Test
    void testMocking() {
        // Create a mock of the Calculator class
        Calculator calculatorMock = mock(Calculator.class);

        // Define behavior for the mock
        when(calculatorMock.add(2, 3)).thenReturn(5);
        when(calculatorMock.subtract(5, 3)).thenReturn(2);

        // Call methods on the mock and verify behavior
        assertEquals(5, calculatorMock.add(2, 3), "Mocked addition should return 5");
        assertEquals(2, calculatorMock.subtract(5, 3), "Mocked subtraction should return 2");

        // Verify that the methods were called with specific arguments
        verify(calculatorMock).add(2, 3);
        verify(calculatorMock).subtract(5, 3);

        // Verify that no other interactions occurred
        verifyNoMoreInteractions(calculatorMock);
    }

    @Test
    void testMockingWithException() {
        // Create a mock of the Calculator class
        Calculator calculatorMock = mock(Calculator.class);

        // Define behavior to throw an exception
        when(calculatorMock.divide(10, 0)).thenThrow(new ArithmeticException("Cannot divide by zero"));

        // Verify exception is thrown
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculatorMock.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message should match");

        // Verify method interaction
        verify(calculatorMock).divide(10, 0);
        verifyNoMoreInteractions(calculatorMock);
    }
}
