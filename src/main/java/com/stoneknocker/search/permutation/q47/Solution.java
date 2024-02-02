package com.stoneknocker.search.permutation.q47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    void backtrack(List<List<Integer>> result, int[] nums, int pos) {
        if (pos == nums.length) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        Set<Integer> used = new HashSet<>();
        for (int i=pos; i<nums.length; i++) {
            // wrong, think about 1 2 2
//            if (i>pos && nums[i]==nums[pos]) {
//                continue;
//            }
            if (!used.add(nums[i])) {
                continue;
            }
            swap(nums, pos, i);
            backtrack(result, nums, pos+1);
            swap(nums, pos, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{2,2,1,1}));
        System.out.println(solution.permuteUnique(new int[]{1,1,2,2}));
        System.out.println(solution.permuteUnique(new int[]{1,2,1,2}));
        System.out.println(solution.permuteUnique(new int[]{1,1,2}));
        System.out.println(solution.permuteUnique(new int[]{1,2,3}));
        System.out.println(solution.permuteUnique(new int[]{0,1}));
        System.out.println(solution.permuteUnique(new int[]{1}));
    }
}
