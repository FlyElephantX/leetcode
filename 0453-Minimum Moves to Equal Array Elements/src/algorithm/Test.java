package algorithm;

class Solution {
    public int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            sum = sum + nums[i];
        }
        int m = sum - min * nums.length;
        return m;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        int m = solution.minMoves(nums);
        System.out.println("移动的次数:" + m);
    }
}
