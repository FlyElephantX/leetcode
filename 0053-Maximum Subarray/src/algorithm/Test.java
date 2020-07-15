package algorithm;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            int cur = sum + nums[i];
            sum = cur > nums[i] ? cur : nums[i];
            max = sum > max ? sum : max;
        }
        return max;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrs = {-2,1};
        int res = solution.maxSubArray(arrs);
        System.out.println("最大连续子序列和:" + res);
    }
}
