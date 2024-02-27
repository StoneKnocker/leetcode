package com.stoneknocker.search.binarysearch.q268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (var num: nums) {
            sum += num;
        }

        int sum2 = (0+nums.length)*(nums.length+1)/2;
        return sum2-sum;
    }
} 