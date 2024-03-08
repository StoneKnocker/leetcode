package com.stoneknocker.search.binarysearch;

public class BinarySearch {
    public int firstEqualValue(int[] nums, int value) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (nums[mid] > value) {
                high = mid-1;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || nums[mid-1] != value) {
                    return mid;
                }
                high = mid-1;
            }
        }

        return -1;
    }

    public int lastEqualValue(int[] nums, int value) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (nums[mid] > value) {
                high = mid - 1;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == nums.length-1 || nums[mid+1] != value) {
                    return mid;
                }
                low = mid + 1;
            }
        }

        return -1;
    }

    public int firstGreaterEqualValue(int[] nums, int value) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (nums[mid] >= value) {
                if (mid == 0 || nums[mid-1] < value) {
                    return mid;
                }
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int lastLessEqualValue(int[] nums, int value) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (nums[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == nums.length-1 || nums[mid+1] > value) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        var bsearch = new BinarySearch();
        int[] nums = new int[]{1,3,4,5,6,8,8,8,11,18};
        System.out.println(bsearch.firstEqualValue(nums, 8));
        System.out.println(bsearch.lastEqualValue(nums, 8));
        System.out.println(bsearch.firstGreaterEqualValue(nums, 8));
        System.out.println(bsearch.firstGreaterEqualValue(nums, 9));
        System.out.println(bsearch.lastLessEqualValue(nums, 8));
        System.out.println(bsearch.lastLessEqualValue(nums, 11));
    }
}
