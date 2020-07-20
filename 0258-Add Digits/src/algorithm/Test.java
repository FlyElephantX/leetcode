package algorithm;

class Solution {
    public int addDigits(int num) {
        int res = sumDigits(num);
        if (res < 10) {
            return res;
        } else {
            while (res >= 10) {
                res = sumDigits(res);
            }
            return res;
        }
    }

    public int sumDigits(int num) {
        int res = 0;
        while (num != 0) {
            res = res + num % 10;
            num = num / 10;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.addDigits(38);
        System.out.println("返回的结果:" + res);
    }
}
