package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char cur = ransomNote.charAt(i);
            if (map.containsKey(cur) && map.get(cur) > 0) {
                map.put(cur, map.getOrDefault(cur, 0) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean res = solution.canConstruct(ransomNote, magazine);
        System.out.println("结果:" + res);
    }
}
