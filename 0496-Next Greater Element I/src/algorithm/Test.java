package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int num = -1;
                    if (j + 1 < nums2.length && nums1[i] < nums2[j + 1]) {
                        num = nums2[j + 1];
                    } else {
                        while (j + 1 < nums2.length && nums1[i] > nums2[j + 1]) {
                            j++;
                        }
                        if (j + 1 < nums2.length) {
                            num = nums1[i] < nums2[j + 1] ? nums2[j + 1] : -1;
                        }
                    }
                    list.add(num);
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};
        int[] res = solution.nextGreaterElement(num1, num2);
        System.out.println("结果:" + Arrays.toString(res));
    }
}
