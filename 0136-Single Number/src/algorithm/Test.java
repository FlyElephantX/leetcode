package algorithm;

class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1;i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,1};
        int res = solution.singleNumber(nums);
        System.out.println("出现一次的数字:" + res);
    }
}
