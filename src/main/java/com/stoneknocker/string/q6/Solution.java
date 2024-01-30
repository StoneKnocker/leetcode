package com.stoneknocker.string.q6;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int numCols = 2 * (int)Math.ceil((double)s.length()/(numRows + numRows - 2));
        char[][] matrix = new char[numRows][numCols];
        int pos = 0;
        label: for (int col=0; col<numCols; col++) {
            if (col%2 == 0) {
                for (int row = 0; row < numRows; row++) {
                    matrix[row][col] = s.charAt(pos++);
                    if (pos == s.length()) {
                        break label;
                    }
                }
            } else {
                for (int row = numRows-2; row>0; row--) {
                    matrix[row][col] = s.charAt(pos++);
                    if (pos == s.length()) {
                        break label;
                    }
                }
            }
        }
        char[] result = new char[s.length()];
        int p = 0;
        for (int row=0; row<numRows; row++) {
            for (int col=0; col<numCols; col++) {
                if (matrix[row][col] != 0) {
                    result[p++] = matrix[row][col];
                }
            }
        }

        return new String(result);
    }
}