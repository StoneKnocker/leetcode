package com.stoneknocker.q38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void one() {
        var solution = new Solution();
        assertEquals("1",solution.countAndSay(1));
        assertEquals("11",solution.countAndSay(2));
        assertEquals("21",solution.countAndSay(3));
        assertEquals("1211",solution.countAndSay(4));

    }
}
