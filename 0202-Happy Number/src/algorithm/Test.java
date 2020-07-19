package algorithm;

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        int res = squareNumber(n);
        if (set.contains(res)) {
            return false;
        }
        set.add(res);
        return isHappy(res);
    }

    public int squareNumber(int n) {
        int res = 0;
        while (n != 0) {
            int num = n % 10;
            res = res + num * num;
            n = n / 10;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean res = solution.isHappy(10);
        System.out.println("Happy Number结果:" + res);
    }
}
