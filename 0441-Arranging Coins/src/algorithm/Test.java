package algorithm;

class Solution {
    public int arrangeCoins(int n) {
        int i = 0;
        while (n >= i) {
            n = n - i;
            i++;
        }
        return i - 1;
    }

    public int arrangeCoins2(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = n;
        for (int i = 1; i <= n; i++) {
            if (sum == i) {
                return i;
            } else if (sum < i) {
                return i - 1;
            }
            sum = sum - i;
        }
        return -1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.arrangeCoins2(2147483647);
        System.out.println("行数:" + res);
    }
}
