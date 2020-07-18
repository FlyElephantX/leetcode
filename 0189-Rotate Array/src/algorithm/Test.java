package algorithm;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }
        int len = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, len - 1);
        reverse(nums, len, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int len = end - start;
        for (int i = 0; i <= len / 2; i++) {
            int temp = nums[start + i];
            nums[start + i] = nums[end - i];
            nums[end - i] = temp;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2};
        solution.rotate(nums, 3);
        System.out.println("旋转结果:" + Arrays.toString(nums));
    }
}
