package com.stoneknocker.q13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void test1() {
        var solution = new Solution();
        assertEquals(solution.romanToInt("III"), 3);
        assertEquals(solution.romanToInt("LVIII"), 58);
        assertEquals(solution.romanToInt("MCMXCIV"), 1994);
    }
}
