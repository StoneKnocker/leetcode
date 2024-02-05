package com.stoneknocker.array.q27;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void one() {
        var solution = new Solution();
        assertEquals(1, solution.removeElement(new int[]{2,2,3}, 2));
        assertEquals(0, solution.removeElement(new int[]{1}, 1));
        assertEquals(0, solution.removeElement(new int[]{1,1}, 1));
        assertEquals(1, solution.removeElement(new int[]{0,1,1}, 1));
        assertEquals(2, solution.removeElement(new int[]{3,2,2,3}, 3));
        assertEquals(5, solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
