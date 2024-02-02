package com.stoneknocker.search.permutation.q46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, Arrays.stream(nums).boxed().collect(Collectors.toList()), new ArrayList<>(), nums.length);
        return result;
    }

    void backtrack(List<List<Integer>> result, List<Integer> nums, List<Integer> sub, int max) {
        if (sub.size() == max) {
            result.add(new ArrayList<>(sub));
            return;
        }
        for (int i=0; i<nums.size(); i++) {
            sub.add(nums.get(0));
            nums.remove(0);
            backtrack(result, nums, sub, max);
            nums.add(sub.get(sub.size()-1));
            sub.remove(sub.size()-1);
        }
    }

    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack2(result, nums, 0);
        return result;
    }

//    void backtrack2(List<List<Integer>> result, int[] nums, int pos) {
//        if (pos == nums.length-1) {
//            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
//            return;
//        }
//        for (int i=pos; i<nums.length-1; i++) {
//            for (int j=i; j<nums.length; j++) {
//                swap(nums, i, j);
//                backtrack2(result, nums, i+1);
//                swap(nums, i, j);
//            }
//        }
//    }

    void backtrack2(List<List<Integer>> result, int[] nums, int pos) {
        if (pos == nums.length) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            swap(nums, i, pos);
            backtrack2(result, nums, pos + 1);
            swap(nums, i, pos); // Restore the array to its original state
        }
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.permute2(new int[]{1,2,3}));
        System.out.println(solution.permute(new int[]{1,2,3}));
        System.out.println(solution.permute2(new int[]{0,1}));
        System.out.println(solution.permute(new int[]{0,1}));
        System.out.println(solution.permute2(new int[]{1}));
        System.out.println(solution.permute(new int[]{1}));
    }
}
