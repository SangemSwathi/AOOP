package com.example.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class StringUtilTest {

    // Test case 1: String with duplicates
    public void testStringWithDuplicates() {
        String input = "banana";
        String expected = "ban";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 2: String without duplicates
    @Test
    public void testStringWithoutDuplicates() {
        String input = "abcdef";
        String expected = "abcdef";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 3: Empty string
    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 4: String with all characters the same
    @Test
    public void testAllSameCharacters() {
        String input = "aaaaaa";
        String expected = "a";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 5: String with numbers and symbols
    @Test
    public void testStringWithSymbols() {
        String input = "a1!a1!";
        String expected = "a1!";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 6: String with mixed case
    @Test
    public void testMixedCase() {
        String input = "AaBbCcAa";
        String expected = "AaBbCc";
        String result = StringUtil.removeDuplicates(input);
        assertEquals(expected, result);
    }

    // Test case 7: Null input
    @Test
    public void testNullInput() {
        String input = null;
        String result = StringUtil.removeDuplicates(input);
        assertNull(result, "Should return null for null input");
    }
}
