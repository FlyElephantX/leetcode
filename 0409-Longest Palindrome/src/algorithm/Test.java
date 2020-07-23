package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        if (map.values().size() == 1) {
            return map.get(s.charAt(0));
        }
        int count = 0;
        for (int val : map.values()) {
            if (val / 2 > 0) {
                count = count + val / 2;
            }
        }
        int len = count * 2;
        int res = s.length() - len;
        return  res >= 1 ? len + 1 : len;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "bananas";
        int res = solution.longestPalindrome(str);
        System.out.println("回文串长度:" + res);
    }
}
