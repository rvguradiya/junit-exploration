package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the StringUtils class.
 */
public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"), "'madam' should be a palindrome");
        assertTrue(stringUtils.isPalindrome("racecar"), "'racecar' should be a palindrome");
        assertFalse(stringUtils.isPalindrome("hello"), "'hello' should not be a palindrome");
        assertFalse(stringUtils.isPalindrome(null), "Null input should not be a palindrome");
    }

    @Test
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"), "Reversed 'hello' should be 'olleh'");
        assertEquals("", stringUtils.reverse(""), "Reversed empty string should be empty string");
        assertNull(stringUtils.reverse(null), "Reversed null should be null");
    }

    @Test
    void testCountVowels() {
        assertEquals(5, stringUtils.countVowels("education"), "'education' should have 5 vowels");
        assertEquals(0, stringUtils.countVowels("rhythm"), "'rhythm' should have 0 vowels");
        assertEquals(0, stringUtils.countVowels(null), "Null input should have 0 vowels");
        assertEquals(3, stringUtils.countVowels("AEIoU"), "'AEIoU' should have 3 vowels");
    }
}
