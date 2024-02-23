package com.stoneknocker.sort;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] nums) {
        merge_sort(nums, 0, nums.length-1);
    }

    public void merge_sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left+right)/2;
        merge_sort(nums, left, mid);
        merge_sort(nums, mid+1, right);
        merge(nums, left, right);
    }

    void merge(int[] nums, int left, int right) {
        int[] tmps = new int[right-left+1];

        int mid = (left+right)/2;
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                tmps[k++] = nums[i++];
            } else {
                tmps[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmps[k++] = nums[i++];
        }
        while (j <= right) {
            tmps[k++] = nums[j++];
        }

        k = 0;
        for (int n=left; n<=right; n++) {
            nums[n] = tmps[k++];
        }
    }

    public static void main(String[] args) {
        var bubble = new MergeSort();
        int[] nums = {5,4,6,3,2,1};
        bubble.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
