package com.stoneknocker.array.q26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int reader = 1;
        int writer = 0;
        while (reader < nums.length) {
            if (nums[reader] == nums[writer]) {
                reader++;
            } else {
                nums[++writer] = nums[reader];
                reader++;
            }
        }
        return writer+1;
    }
}
