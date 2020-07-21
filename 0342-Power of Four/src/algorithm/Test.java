package algorithm;

import javax.swing.plaf.IconUIResource;

class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 4 == 0) {
            num = num / 4;
        }
        return num == 1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 15;
        int n = 16 & 16;
        System.out.println("res:" + 15);
        boolean res = solution.isPowerOfFour2(num);
        if (res) {
            System.out.println(num + "是4的幂指数");
        } else {
            System.out.println(num + "不是4的幂指数");
        }
    }
}
