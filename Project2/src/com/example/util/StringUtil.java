package com.example.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtil {

    // Function to remove duplicate characters from a string
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Using LinkedHashSet to maintain the insertion order of characters
        Set<Character> charSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases from main
        String input1 = "banana";
        String input2 = "apple";
        String input3 = "abcdefg";
        String input4 = "aabbccddeeff";
        String input5 = "";

        System.out.println("Input: " + input1 + " | Output: " + removeDuplicates(input1));
        System.out.println("Input: " + input2 + " | Output: " + removeDuplicates(input2));
        System.out.println("Input: " + input3 + " | Output: " + removeDuplicates(input3));
        System.out.println("Input: " + input4 + " | Output: " + removeDuplicates(input4));
        System.out.println("Input: " + input5 + " | Output: " + removeDuplicates(input5));
    }
}
