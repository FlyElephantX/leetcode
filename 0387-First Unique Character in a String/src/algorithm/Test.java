package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        int[] count = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                int index = map.get(cur);
                int num = count[index];
                count[index] = num + 1;
            } else {
                map.put(cur, i);
                count[i] = 1;
            }
        }
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (count[i] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "eeelfh";
        int index = solution.firstUniqChar(str);
        System.out.println("索引:" + index);
    }
}
