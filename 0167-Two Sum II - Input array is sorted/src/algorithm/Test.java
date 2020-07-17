package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i + 1};
            }
            map.put(numbers[i], i + 1);
        }
        return new int[]{-1, -1};
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int[] res = solution.twoSum(nums, 9);
        System.out.println("返回结果:" + Arrays.toString(res));
    }
}
