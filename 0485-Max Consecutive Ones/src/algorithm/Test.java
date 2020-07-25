package algorithm;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == 1 ? 1 : 0;
        }
        int begin = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                end = end == i ? end : end + 1;
                max = Math.max(max, end - begin + 1);
            } else {
                while (i < nums.length && nums[i] != 1) {
                    i++;
                }
                begin = i;
                end = i;
                if (i == nums.length - 1 || (i + 1 < nums.length && nums[i + 1] == 0)) {
                    max = Math.max(max, end - begin + 1);
                }
            }

        }
        return max;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        int res = solution.findMaxConsecutiveOnes(nums);
        System.out.println("最终的结果:" + res);
    }
}
