package algorithm;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i ++) {
            if (target <= nums[i]) {
                index = i;
                break;
            }
            if (i == len - 1) {
                index = i + 1;
            }
        }
        return index;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,5,6};
        int index = solution.searchInsert(nums, 7);
        System.out.println("索引位置:" + index);
    }
}
