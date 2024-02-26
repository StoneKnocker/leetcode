package com.stoneknocker.stack.q224;


public class Solution {
    private int index;
    public int calculate(String s) {
        index = 0;
        return calc(s);
    }
    private int calc(String s) {
        int result = 0;
        int num = 0;
        int sign = 1;
        while (index < s.length()) {
            char c = s.charAt(index++);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '(') {
                num = calc(s);
            } else if (c == ')') {
                return result + num * sign;
            } else if (c == '-' || c == '+') {
                result += num * sign;
                sign = c == '+' ? 1 : -1;
                num = 0;
            }
        }

        return result + sign * num;
    }
}
