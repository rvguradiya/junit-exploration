package com.example;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates parameterized tests in JUnit.
 */
public class ParameterizedTest {

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "radar"})
    void testIsPalindrome(String input) {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome(input), input + " should be a palindrome");
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({
            "education, 5",
            "rhythm, 0",
            "AEIoU, 5",
            "hello, 2"
    })
    void testCountVowels(String input, int expectedVowels) {
        StringUtils stringUtils = new StringUtils();
        assertEquals(expectedVowels, stringUtils.countVowels(input), "Incorrect vowel count for " + input);
    }
}
