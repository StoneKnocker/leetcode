package com.stoneknocker.q13;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length()-1; i++) {
            if (characterValue(s.charAt(i)) >= characterValue(s.charAt(i+1))) {
                sum += characterValue(s.charAt(i));
            } else {
                sum += characterValue(s.charAt(i+1)) - characterValue(s.charAt(i));
                ++i;
                if (i == s.length()-1) {
                    return sum;
                }
            }
        }
        return sum + characterValue(s.charAt(s.length()-1));
    }

    public int characterValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;
        }
    }
}