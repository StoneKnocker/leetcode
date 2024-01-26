package com.stoneknocker.q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertTrue(solution.longestPalindrome("babad").equals( "aba") || solution.longestPalindrome("babad").equals( "bab"));
        assertEquals(solution.longestPalindrome("cbbd"), "bb");
        assertEquals("a", solution.longestPalindrome("a"));
    }
}
