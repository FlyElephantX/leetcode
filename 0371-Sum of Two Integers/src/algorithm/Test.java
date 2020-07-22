package algorithm;

class Solution {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = a & b;
        while (carry != 0) {
            int num1 = sum;
            int num2 = carry << 1;
            sum = num1 ^ num2;
            carry = num1 & num2;
        }
        return sum;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.getSum(8, 6);
        System.out.println("求和结果:" + res);
    }
}
