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

    public boolean isPowerOfFour2(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0xaaaaaaaa) == 0);
    }

}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 16;
        boolean res = solution.isPowerOfFour2(num);
        if (res) {
            System.out.println(num + "是4的幂指数");
        } else {
            System.out.println(num + "不是4的幂指数");
        }
    }
}
