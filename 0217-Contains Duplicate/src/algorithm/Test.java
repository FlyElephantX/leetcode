package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hasMap.containsKey(nums[i])) {
                return true;
            } else {
                hasMap.put(nums[i], 1);
            }
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean res = solution.containsDuplicate(nums);
        System.out.println("数组是否包含重复数字:" + res);
    }
}
