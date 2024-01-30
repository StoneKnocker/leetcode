package com.stoneknocker.string.q38;


class Solution {
    public String countAndSay(int n) {
        var s = "1";
        for (int i=1; i<n; i++) {
            s = say(s);
        }
        return s;
    }

    public String say(String s) {
        var sb = new StringBuilder();
        char pre = s.charAt(0);
        int count = 1;
        for (int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == pre) {
                count++;
            } else {
                sb.append(count).append(pre);
                count = 1;
                pre = c;
            }
        }
        sb.append(count).append(pre);

        return sb.toString();
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.say("1211"));
    }
}