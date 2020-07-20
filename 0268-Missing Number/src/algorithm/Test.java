package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        int n = nums.length;
        int res = n * (n + 1) / 2 - sum;
        return res;
    }

    public int missingNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,0,1};
        int res = solution.missingNumber(nums);
        System.out.println("缺失的数字:" + res);
    }
}
