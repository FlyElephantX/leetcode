package algorithm;

class Solution {
    public int rob1(int[] nums) {
        return rob1(nums, nums.length - 1);
    }

    private int rob1(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        return Math.max(rob1(nums, i - 2) + nums[i], rob1(nums, i - 1));
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        return memo[nums.length];
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,1,1,2};
        int val = solution.rob(nums);
        System.out.println("最终结果:" + val);
    }
}
