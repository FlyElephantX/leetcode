package algorithm;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum = sum + i + num / i;
            }
        }
        sum++;
        return sum == num;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 28;
        boolean res = solution.checkPerfectNumber(num);
        System.out.println(num + "完美数字结果:" + res);
    }
}
