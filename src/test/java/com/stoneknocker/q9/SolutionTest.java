package com.stoneknocker.q9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertEquals(true, solution.isPalindrome(121));
        assertEquals(false, solution.isPalindrome(-1));
        assertEquals(true, solution.isPalindrome(1));
        assertEquals(true, solution.isPalindrome(11));
        assertEquals(false, solution.isPalindrome(10));
        assertEquals(true, solution.isPalindrome(1221));
        assertEquals(false, solution.isPalindrome(-121));
        assertEquals(false, solution.isPalindrome(12));
    }

}