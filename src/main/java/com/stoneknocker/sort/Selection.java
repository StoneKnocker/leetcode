package com.stoneknocker.sort;

import java.util.Arrays;

public class Selection {
    public void sort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int minIndex = i;
            int minValue = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                if (nums[j] < minValue) {
                    minIndex = j;
                    minValue = nums[j];
                }
            }
            swap(nums, i, minIndex);
        }
    }    

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        var bubble = new Selection();
        int[] nums = {5,4,6,3,2,1};
        bubble.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
