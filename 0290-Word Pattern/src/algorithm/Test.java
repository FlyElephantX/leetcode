package algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length() == 0 || str.length() == 0) {
            return false;
        }
        String[] list = str.split(" ");
        if (list.length != pattern.length()) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            String s = "" + pattern.charAt(i);
            if (!map.containsKey(list[i]) && !map.containsValue(s)) {
                map.put(list[i], "" + pattern.charAt(i));
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                sb.append(map.get(list[i]));
            }
        }
        return sb.toString().equals(pattern);
    }
    public boolean wordPattern1(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i) {
            Object o1 = index.put(pattern.charAt(i), i);
            Object o2 = index.put(words[i], i);
            if (o1 != o2) {
                return false;
            }
        }
        return true;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean res = solution.wordPattern1(pattern, str);
        if (res) {
            System.out.println("模式匹配");
        } else {
            System.out.println("模式不匹配");
        }
    }
}
