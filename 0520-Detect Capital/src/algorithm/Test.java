package algorithm;

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return false;
        }
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        boolean res = false;
        if (count == word.length() || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)))) {
            res = true;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Google";
        boolean res = solution.detectCapitalUse(str);
        System.out.println(str + "字符串结果:" + res);
    }
}
