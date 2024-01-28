package com.stoneknocker.q14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    void test1() {
        var solution = new Solution();
        assertEquals("",solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("fl",solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
