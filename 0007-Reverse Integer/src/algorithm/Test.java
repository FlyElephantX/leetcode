package algorithm;

class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int tail = x % 10;
            System.out.println("num:"+tail);
            res = res * 10 + tail;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }

    public int reverse1(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int num = res * 10 + tail;
            if ((num - tail) / 10 != res) {
                return 0;
            }
            res = num;
            x = x / 10;
        }
        return res;
    }
}

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.reverse1(1534236469);
        System.out.println("翻转结果:"+res);
    }
}
