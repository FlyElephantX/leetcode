package algorithm;

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = (left + right) / 2;
            int res = mid * mid;
            if (res == num) {
                return true;
            } else if (res > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isPerfectSquare(196);
        if (res) {
            System.out.println("是平方数");
        } else {
            System.out.println("不是平方数");
        }
    }
}
