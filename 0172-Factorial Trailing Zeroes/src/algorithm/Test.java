package algorithm;

//https://zxi.mytechroad.com/blog/math/leetcode-172-factorial-trailing-zeroes/
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res = res + n / 5;
            n = n / 5;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.trailingZeroes(5);
        System.out.println("阶乘的结果:" + res);
    }
}
