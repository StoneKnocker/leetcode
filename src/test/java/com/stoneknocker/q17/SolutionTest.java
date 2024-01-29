package com.stoneknocker.q17;

import com.stoneknocker.q14.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void test1() {
        var solution = new Solution();
        assertEquals("23",solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("fl",solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
