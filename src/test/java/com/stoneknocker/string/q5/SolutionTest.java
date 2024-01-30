package com.stoneknocker.string.q5;

import com.stoneknocker.string.q5.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertTrue(solution.longestPalindrome("babad").equals("aba") || solution.longestPalindrome("babad").equals("bab"));
        assertEquals(solution.longestPalindrome("cbbd"), "bb");
        assertEquals("a", solution.longestPalindrome("a"));
    }
}