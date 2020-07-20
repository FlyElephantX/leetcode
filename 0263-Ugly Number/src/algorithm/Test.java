package algorithm;

class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isUgly(25);
        if (res) {
            System.out.println("是丑数");
        } else {
            System.out.println("不是丑数");
        }
    }
}
