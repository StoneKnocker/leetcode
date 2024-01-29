package com.stoneknocker.q28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertEquals(1,solution.strStr("abc", "bc"));
        // 各种单元测试的case
        assertEquals(0,solution.strStr("abc", "a"));
        assertEquals(0,solution.strStr("abc", "ab"));
        assertEquals(0,solution.strStr("abc", "abc"));
        assertEquals(1,solution.strStr("abc", "bc"));
        assertEquals(1,solution.strStr("abc", "b"));
        assertEquals(2,solution.strStr("abc", "c"));
        assertEquals(-1,solution.strStr("abc", "d"));
        assertEquals(-1,solution.strStr("abc", "abcd"));
        assertEquals(0,solution.strStr("a", "a"));
        assertEquals(-1,solution.strStr("a", "b"));
        assertEquals(0,solution.strStr("a", ""));
        assertEquals(0,solution.strStr("", ""));
        assertEquals(-1,solution.strStr("", "a"));
        assertEquals(-1,solution.strStr("mississippi", "issipi"));
        assertEquals(4,solution.strStr("mississippi", "issip"));
    }
}
