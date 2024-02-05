package com.stoneknocker.array.q80;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void test() {
        var solution = new Solution();
        assertEquals(5, solution.removeDuplicates(new int[]{1,1,1,2,2,3}));
        assertEquals(3, solution.removeDuplicates(new int[]{1,1,2}));
        assertEquals(1, solution.removeDuplicates(new int[]{1}));
        assertEquals(2, solution.removeDuplicates(new int[]{1,1}));
        assertEquals(3, solution.removeDuplicates(new int[]{1,2,3}));
        assertEquals(7, solution.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
        assertEquals(9, solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
