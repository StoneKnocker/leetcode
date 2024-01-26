package com.stoneknocker.q6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void one() {
        assertEquals(8, fun(14, 3));
        assertEquals(6, fun(14, 4));
    }

    int fun(int length, int numRows) {
        int numCols = 2 * (int)Math.ceil((double)length/(numRows + numRows - 2));
        return numCols;
    }

    @Test
    void two() {
        var solution = new Solution();
//        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
//        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        assertEquals("a", solution.convert("a", 1));
    }
}
