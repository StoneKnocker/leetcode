package com.stoneknocker.dp.q70;

public class Solution {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        int temp = 0;
        int a = 1;
        int b = 2;
        for (int i=3;i<=n;i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

    public int climbStairs2(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return climbStairs2(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.climbStairs(3));
        System.out.println(solution.climbStairs2(3));
        System.out.println(solution.climbStairs(4));
        System.out.println(solution.climbStairs2(4));
        System.out.println(solution.climbStairs(5));
        System.out.println(solution.climbStairs2(5));
    }
}
