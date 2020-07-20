package algorithm;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                swap(nums, i++, j++);
            }
        }
    }

    public void moveZeroes1(int[] nums) {
        int index = 0;
        int start = 0;
        int count = 0;
        while (start < nums.length && index < nums.length) {
            if (nums[start] == 0 && count == 0) {
                count++;
                index = start;
            } else if (nums[start] != 0 && nums[index] == 0) {
                while (nums[start] != 0 && nums[index] == 0) {
                    swap(nums, index ,start);
                    index++;
                    start++;
                    if (index >= nums.length || start >= nums.length) {
                        break;
                    }
                }
            } else {
                start++;
            }
        }
    }

    public void  swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

public class Test {

    public static void main(String[] args) {
        int[] nums = {1,0,1};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println("移动结果:" + Arrays.toString(nums));
    }
}
