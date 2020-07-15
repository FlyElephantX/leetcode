package algorithm;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m + n];
        int i = 0;
        int j = 0;
        int h = 0;
        while (i < m && j < n) {
            int val;
            if (nums1[i] <= nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            num[h++] = val;
        }
        while (i < m) {
            num[h++] = nums1[i++];
        }
        while (j < n) {
            num[h++] = nums2[j++];
        }
        for (int f = 0;f < m + n; f++) {
            nums1[f] = num[f];
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        solution.merge(num1, 3, num2, 3);
    }
}
