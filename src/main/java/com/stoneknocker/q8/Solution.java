package com.stoneknocker.q8;

class Solution {
    public int myAtoi(String s) {
        boolean hasSign = false;
        boolean isNegative = false;
        int digitalStartPos = -1;
        int digitalEndPos = -1;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (hasSign) {
                    break;
                }
            }
            else if (s.charAt(i) == '+') {
                if (hasSign) {
                    break;
                }
                hasSign = true;
            }
            else if (s.charAt(i) == '-') {
                if (hasSign) {
                    break;
                }
                hasSign = true;
                isNegative = true;
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (digitalStartPos == -1) {
                    digitalStartPos = i;
                }
                digitalEndPos = i;
                hasSign = true;
            } else {
                    break;
            } 
        }
        if (digitalStartPos == -1) {
            return 0;
        }
        long sum = 0;
        for (int i=digitalStartPos; i<=digitalEndPos; i++) {
            sum = sum*10 + (s.charAt(i)-'0');
            if (!isNegative && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNegative && -sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(isNegative ? -sum : sum) ;
    }
}