package com.stoneknocker.sort;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int q = partition(nums, left, right);
        quickSort(nums, left, q-1);
        quickSort(nums, q+1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int i=left;
        int j=left;
        int pivot = nums[right];
        while (j <= right-1) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, right);

        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        var bubble = new QuickSort();
        int[] nums = {5,4,6,3,2,1};
        bubble.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
