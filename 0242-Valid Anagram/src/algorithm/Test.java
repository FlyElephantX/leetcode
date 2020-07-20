package algorithm;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "rat";
        String t = "cat";
        boolean res = solution.isAnagram(s, t);
        if (res) {
            System.out.println("是变位词");
        } else {
            System.out.println("不是变位词");
        }
    }
}
