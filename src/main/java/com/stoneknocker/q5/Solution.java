package com.stoneknocker.q5;

class Solution {
    public String longestPalindrome(String s) {
        String maxString = "";
        for (int i=0; i<s.length(); i++) {
            String sub1 = palindrome(s, i, i);
            String sub2 = palindrome(s, i, i+1);
            if (sub1.length() > maxString.length()) {
                maxString = sub1;
            }
            if (sub2.length() > maxString.length()) {
                maxString = sub2;
            }
        }

        return maxString;
    }

    String palindrome(String s, int l, int r) {
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
}