package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int num = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int cur = digits[i] + num;
            num = cur / 10;
            list.add(0,cur % 10);
        }
        if (num > 0) {
            list.add(0, num);
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9,9,9};
        int[] res = solution.plusOne(digits);
        System.out.println("结果:" + Arrays.toString(res));
    }
}
