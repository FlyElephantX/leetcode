package algorithm;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int reverse = 0;
        while (x != 0) {
            int tail = x % 10;
            reverse = reverse * 10 + tail;
            x = x / 10;
        }
        return num == reverse;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isPalindrome(121);
        if (res) {
            System.out.println(res + "是回文数字");
        } else {
            System.out.println(res + "不是回文数字");
        }
    }
}
