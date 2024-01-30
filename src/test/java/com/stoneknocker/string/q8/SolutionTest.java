package com.stoneknocker.string.q8;

import com.stoneknocker.string.q8.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertEquals(2147483647, solution.myAtoi("9223372036854775808"));
        assertEquals(0, solution.myAtoi("   +0 123"));
        assertEquals(0, solution.myAtoi("00000-42a1234"));
        assertEquals(0, solution.myAtoi("+-12"));
        assertEquals(0, solution.myAtoi("++12"));
        assertEquals(0, solution.myAtoi("-+12"));
        assertEquals(12, solution.myAtoi("+12--++"));
        assertEquals(1, solution.myAtoi("+1"));
        assertEquals(-1, solution.myAtoi("-1"));
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("-42"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(0, solution.myAtoi("a4193 with words"));
        assertEquals(-2147483648, solution.myAtoi("-91283472332"));
        assertEquals(3, solution.myAtoi("3.14159"));
    }
}