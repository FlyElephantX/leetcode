package algorithm;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        int count = 0;
        for (int i = 0;i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n < 1) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 218;
        boolean res = solution.isPowerOfTwo2(num);
        System.out.println(num + "幂指数结果:" + res);
    }
}
