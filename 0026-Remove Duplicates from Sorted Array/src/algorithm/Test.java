package algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = list.get(i);
        }
        return count;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-3,-1,0,0,0,3,3};
        int count = solution.removeDuplicates(nums);
        System.out.println("长度为:" + count);
    }
}
