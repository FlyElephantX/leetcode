package algorithm;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map map1 = new HashMap();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map1.containsKey(nums2[i]) && !list.contains(nums2[i])) {
                list.add(nums2[i]);
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
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] res = solution.intersection(num1, num2);
        System.out.println("数组交集:" + Arrays.toString(res));
    }
}
