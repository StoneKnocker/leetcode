package com.stoneknocker.array.q27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length-1;
        for (int i=lastIndex; i>=0; i--) {
            if (nums[i] == val) {
                lastIndex = i-1;
            } else {
                break;
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (i > lastIndex) {
                break;
            }
            if (nums[i] == val) {
                swap(nums, lastIndex, i);
                lastIndex--;
            }
            if (nums[i] == val) {
                i--;
            }
        }
        return lastIndex+1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
