package com.stoneknocker.q14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int lenShortestIndex = 0;
        int lenShortest = strs[0].length();
        for (int i=1; i<strs.length; i++) {
            if (strs[i].length() < lenShortest) {
                lenShortest = strs[i].length();
                lenShortestIndex = i;
            }
        }
        int j;
        label: for (j=0; j<lenShortest; j++) {
            char c = strs[lenShortestIndex].charAt(j);
            for (int i=0; i<strs.length; i++) {
                if (strs[i].charAt(j) != c) {
                    break label;
                }
            }
        }
        return strs[lenShortestIndex].substring(0,j);
    }
}