package algorithm;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int len = strs[0].length();
        for (int i = 0;i < strs.length;i++) {
            int length = strs[i].length();
            len = length < len ? length : len;
        }
        String res = "";
        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < strs.length - 1; j++) {
                char cur = strs[j].charAt(i);
                char next = strs[j + 1].charAt(i);
                if (cur != next) {
                    return res;
                }
                if (j == strs.length - 2) {
                    res = res + cur;
                }
            }
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"aca","cba"};
        String res = solution.longestCommonPrefix(strs);
        System.out.println("最长前缀:" + res);
    }
}
