package com.stoneknocker.sort;

import java.util.Arrays;

public class Insertion {
    public void sort(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int k = i;
            for (int j=0; j<i; j++) {
                if (nums[i] < nums[j]) {
                    k = j;
                    break;
                }
            }
            int tmp = nums[i];
            for (int m=i;m>k;m--) {
                nums[m] = nums[m-1];
            }
            nums[k] = tmp;
        }
    }

    
    public void sort2(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int value = nums[i];
            int j;
            for (j=i-1;j>=0;j--) {
                if (nums[j] > value) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+1] = value;
        }
    }

    public static void main(String[] args) {
        var bubble = new Insertion();
        int[] nums = {5,4,6,3,2,1};
        bubble.sort2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
