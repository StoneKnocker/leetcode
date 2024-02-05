package com.stoneknocker.array.q80;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int writer = 0;
        int reader = 1;
        int count = 1;
        // Integer repeatNum = null;
        while (reader < nums.length) {
            if (nums[reader] == nums[writer]) {
                count++;
                if (count <= 2) {
                    nums[++writer] = nums[reader];
                }
                reader++;
            } else {
                nums[++writer] = nums[reader];
                reader++;
                count = 1;
                // repeatNum = nums[reader];
            }
        }

        return writer+1;
    }
}
