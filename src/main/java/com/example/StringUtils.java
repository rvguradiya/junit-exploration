package com.example;

/**
 * A utility class for common string operations.
 */
public class StringUtils {

    /**
     * Checks if a string is a palindrome.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    /**
     * Reverses the given string.
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Counts the number of vowels in a string.
     *
     * @param input the string to analyze
     * @return the number of vowels in the string
     */
    public int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}

