package algorithm;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isPowerOfThree(27);
        if (res) {
            System.out.println("3的平方数");
        } else {
            System.out.println("不是3的平方数");
        }
    }
}
