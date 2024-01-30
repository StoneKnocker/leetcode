package com.stoneknocker.string.q17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, Character[]> map = new HashMap<>();
        map.put('2', new Character[]{'a','b','c'});
        map.put('3', new Character[]{'d','e','f'});
        map.put('4', new Character[]{'g','h','i'});
        map.put('5', new Character[]{'j','k','l'});
        map.put('6', new Character[]{'m','n','o'});
        map.put('7', new Character[]{'p','q','r','s'});
        map.put('8', new Character[]{'t','u','v'});
        map.put('9', new Character[]{'w','x','y','z'});

        if (digits.length() == 0) {
            return List.of();
        }
        List<StringBuffer> cache = new ArrayList<>();
        Character[] chars = map.get(digits.charAt(0));
        for (var i=0;i<chars.length; i++) {
            var c = chars[i];
            var sb = new StringBuffer();
            sb.append(c);
            cache.add(sb);
        }

        for (var i=1;i<digits.length();i++) {
            Character[] chars2 = map.get(digits.charAt(i));
            List<StringBuffer> cache2 = new ArrayList<>();
            for (var j=0;j<chars2.length;j++) {
                for (int k=0;k<cache.size();k++) {
                    var buffer = new StringBuffer(cache.get(k));
                    buffer.append(chars2[j]);
                    cache2.add(buffer);
                }
            }
            cache = cache2;
        }

        List<String> result = new ArrayList<>();
        for (int i=0;i<cache.size();i++) {
            result.add(cache.get(i).toString());
        }
        return result;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
        System.out.println(solution.letterCombinations(""));
        System.out.println(solution.letterCombinations("2"));
        System.out.println(solution.letterCombinations("29"));
    }

}