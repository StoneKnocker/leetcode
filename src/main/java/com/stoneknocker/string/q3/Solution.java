package com.stoneknocker.string.q3;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i=0; i<s.length(); i++) {
            var charSet = new HashSet<Character>();
            int length = 0;
            if (s.length() -i < maxLength) {
                break;
            }
            for (int j=i; j<s.length(); j++) {
                char c = s.charAt(j);
                if (charSet.contains(c)) {
                    break;
                } else {
                    charSet.add(c);
                    length++;
                }
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    // so bad...
    public int lengthOfLongestSubstring2(String s) {
        for (int len = s.length(); len > 0; len--) {
            for (int i = 0; i <= s.length()-len; i++) {
                var charSet = new HashSet<Character>();
                for (int j = i; j < i+len; j++) {
                    charSet.add(s.charAt(j));
                }
                if (charSet.size() == len) {
                    return len;
                }
            }
        }
        return 0;
    }

    public int lengthOfLongestSubstring3(String s) {
        int MAX = 128;
        int[] pos = new int[MAX];
        Arrays.fill(pos, -1);

        int maxLength = 0;
        int lastRepeatPos = -1;
        for (int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if (pos[currentChar] != -1 && lastRepeatPos < pos[currentChar]) {
                lastRepeatPos = pos[currentChar];
            }
            if (i-lastRepeatPos > maxLength) {
                maxLength = i - lastRepeatPos;
            }

            pos[currentChar] = i;
        }

        return maxLength;
    }
}