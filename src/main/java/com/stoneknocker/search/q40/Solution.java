package com.stoneknocker.search.q40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
                    if (i>startIndex && candidates[i]==candidates[i-1]) continue;
                    components.add(candidates[i]);
                    combination(candidates, i+1, target - candidates[i], components, results);
                    components.remove(components.size()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.combinationSum2(new int[]{2,3,5}, 8));
        System.out.println(solution.combinationSum2(new int[]{2,3,6,7}, 7));
        System.out.println(solution.combinationSum2(new int[]{2}, 1));
        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(solution.combinationSum2(new int[]{1,1,1,2,3,}, 3));
        System.out.println(solution.combinationSum2(new int[]{1,1,1,2,3,}, 4));
        System.out.println(solution.combinationSum2(new int[]{1,1,1,1,1,2,3,4}, 5));
    }
}
