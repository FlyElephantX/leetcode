package algorithm;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "acb";
        String t = "ahbgdc";
        boolean res = solution.isSubsequence(s, t);
        System.out.println("输出结果:" + res);
    }
}
