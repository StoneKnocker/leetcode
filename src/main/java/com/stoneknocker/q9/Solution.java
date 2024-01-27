package com.stoneknocker.q9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        for (int num = x; num > 0; num = num / 10) {
            int remainder = num % 10;
            reverse = reverse*10 + remainder;
        }
        return reverse == x;
    }
}