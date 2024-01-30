package com.stoneknocker.string.q20;

import com.stoneknocker.string.q20.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertEquals(false,solution.isValid("([)]"));
        assertEquals(true,solution.isValid("([])"));
        assertEquals(true,solution.isValid("()"));
        assertEquals(true,solution.isValid("()[]{}"));
        assertEquals(false,solution.isValid("(]"));
        assertEquals(false,solution.isValid("("));
        assertEquals(false,solution.isValid(")"));
        assertEquals(false,solution.isValid(")("));
        assertEquals(false,solution.isValid("))"));
    }
}
