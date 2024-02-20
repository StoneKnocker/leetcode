package com.stoneknocker.sort;

import java.util.Arrays;

public class Bubble {
    public void sort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    swap(nums, j, j+1);
                }
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        var bubble = new Bubble();
        int[] nums = {5,4,6,3,2,1};
        bubble.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
