package com.stoneknocker.dp.q300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int maxLength = 1;

        dp[0] = 1;
        for (int i=1; i<nums.length; i++) {
            dp[i] = 1;
            for (int j=0; j<i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}
