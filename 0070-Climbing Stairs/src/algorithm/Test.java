package algorithm;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            int num = steps[i - 1] + steps[i - 2];
            steps[i] = num;
        }
        return steps[n - 1];
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.climbStairs(4);
        System.out.println("方式总数:" + res);
    }
}
