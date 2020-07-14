package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> hasMap = new HashMap<String, Integer>();
        hasMap.put("I", 1);
        hasMap.put("V", 5);
        hasMap.put("X", 10);
        hasMap.put("L", 50);
        hasMap.put("C", 100);
        hasMap.put("D", 500);
        hasMap.put("M", 1000);
        int total = 0;
        int pre = 0;
        for (int i = 0; i < s.length();i++) {
            String  cur = "" + s.charAt(i);
            Integer val = hasMap.get(cur);
            total = total + val;
            if (pre > 0 && pre < val) {
                total = total - 2 * pre;
            }
            pre = val;
        }
        return total;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "MCMXCIV";
        int total = solution.romanToInt(str);
        System.out.println("总数:" + total);
    }
}
