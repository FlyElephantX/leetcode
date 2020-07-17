package algorithm;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length < 0) {
            return -1;
        }
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
                count++;
            } else if (nums[i] == res) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,1,3,1,1,4,1,1,5,1,1,6};
        int num = solution.majorityElement(nums);
        System.out.println("出现最多的数字:" + num);
    }
}
