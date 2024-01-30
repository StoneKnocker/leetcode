package com.stoneknocker.search.q39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        combination(candidates, 0, target, new ArrayList<>(), results);
        return results;
    }

    void combination(int[] candidates, int startIndex, int target, List<Integer> components, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(components));
        } else if (target < 0) {
        } else {
            for (int i=startIndex; i<candidates.length; i++) {
                if (target - candidates[i] >= 0) {
                    var newComponents = new ArrayList<>(components);
                    newComponents.add(candidates[i]);
                    combination(candidates, i, target - candidates[i], newComponents, results);
                }
            }
        }
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2,3,5}, 8));
        System.out.println(solution.combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(solution.combinationSum(new int[]{2}, 1));
    }
}
