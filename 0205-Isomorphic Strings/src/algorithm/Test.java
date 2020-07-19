package algorithm;

import javafx.scene.input.ScrollEvent;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> hasMap = new HashMap<>();
        Map<Character, Character> hasMap2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            Character cur = t.charAt(i);
            Character temp = s.charAt(i);
            if (hasMap.containsKey(cur)) {
                sb.append(hasMap.get(cur));
            } else if (hasMap2.containsKey(temp)) {
                sb.append("");
            } else {
                hasMap.put(cur, temp);
                hasMap2.put(temp, cur);
                sb.append(temp);
            }
        }
        return s.equals(sb.toString());
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "aa";
        String s2 = "ab";
        boolean res = solution.isIsomorphic(s1, s2);
        System.out.println(s1 + "与" + s2 + "同构" + res);
    }
}
