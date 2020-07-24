package algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i ++) {
            int index = nums[i];
            count[index] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = solution.findDisappearedNumbers(arr);
        System.out.println("缺失的数字:" + list);
    }
}
