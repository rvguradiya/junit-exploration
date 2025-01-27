package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates the use of lifecycle methods in JUnit.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleTest {

    @BeforeAll
    void setupOnce() {
        System.out.println("@BeforeAll - Runs once before all tests in the class");
    }

    @BeforeEach
    void setup() {
        System.out.println("@BeforeEach - Runs before each test method");
    }

    @Test
    void testMethod1() {
        System.out.println("Executing testMethod1");
        assertTrue(1 < 2, "1 should be less than 2");
    }

    @Test
    void testMethod2() {
        System.out.println("Executing testMethod2");
        assertEquals("hello", "hello", "Strings should match");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - Runs after each test method");
    }

    @AfterAll
    void tearDownOnce() {
        System.out.println("@AfterAll - Runs once after all tests in the class");
    }
}
