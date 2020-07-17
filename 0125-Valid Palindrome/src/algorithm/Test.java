package algorithm;

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "0P";
        boolean res = solution.isPalindrome(str);
        if (res) {
            System.out.println("是回文串");
        } else {
            System.out.println("不是回文串");
        }
    }
}
