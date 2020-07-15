package algorithm;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int len = solution.removeElement(nums, 3);
        System.out.println("长度:" + len);
    }
}
