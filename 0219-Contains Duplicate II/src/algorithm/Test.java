package algorithm;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hasMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hasMap.containsKey(nums[i])) {
                int pre = hasMap.get(nums[i]);
                if (i - pre <= k) {
                    return true;
                } else {
                    hasMap.put(nums[i], i);
                }
            } else {
                hasMap.put(nums[i], i);
            }
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1,2,3};
        boolean res = solution.containsNearbyDuplicate(nums, 1);
        System.out.println("数组是否包含重复数字:" + res);
    }
}
