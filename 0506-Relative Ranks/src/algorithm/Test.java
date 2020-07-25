package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[][] paris = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            paris[i][0] = nums[i];
            paris[i][1] = i;
        }
        Arrays.sort(paris, (a, b) -> (b[0] - a[0]));
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = paris[i][1];
            if (i == 0) {
                result[index] = "Gold Medal";
            } else if (i == 1) {
                result[index] = "Silver Medal";
            } else if (i == 2) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = "" + (i + 1);
            }
        }
        return result;
    }

    public String[] findRelativeRanks2(int[] nums) {
        Integer[] tmp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        Arrays.sort(tmp, Collections.reverseOrder());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                if (nums[i] == tmp[j]) {
                    if (j == 0) {
                        list.add("Gold Medal");
                    } else if (j == 1) {
                        list.add("Silver Medal");
                    } else if (j == 2) {
                        list.add("Bronze Medal");
                    } else {
                        list.add("" + (j + 1));
                    }
                    break;
                }
            }
        }
        return list.toArray(new String[0]);
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,3,8,9,4};
        String[] res = solution.findRelativeRanks(nums);
        System.out.println("排序结果:" + Arrays.toString(res));
    }
}
