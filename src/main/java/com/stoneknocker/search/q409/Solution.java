package com.stoneknocker.search.q409;

class Solution {
    public int longestPalindrome(String s) {
        int[] nums = new int[128];
        for (char c: s.toCharArray()) {
            nums[c-'0'] += 1;
        }

        int total =0;
        int remain = 0;
        for (int num: nums) {
            if (num % 2 == 0) {
                total += num;
            } else if (num >= 1) {
                total += num-1;
                remain = 1;
            }
        }

        return total + remain;
    }
}