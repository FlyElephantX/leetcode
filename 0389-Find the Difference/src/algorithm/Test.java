package algorithm;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < s.length(); i++) {
            if (c1[i] != c2[i]) {
                return c2[i];
            }
        }
        return c2[t.length() - 1];
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "bacd";
        String t = "bcade";
        char res = solution.findTheDifference(s, t);
        System.out.println("输出结果:" + res);
    }
}
