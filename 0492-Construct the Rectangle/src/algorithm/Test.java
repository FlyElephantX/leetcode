package algorithm;

import java.util.Arrays;

class Solution {
    public int[] constructRectangle(int area) {
        int r = (int)Math.sqrt(area);
        while (area % r != 0) {
            r--;
        }
        return new int[]{area / r, r};
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.constructRectangle(4);
        System.out.println("矩形大小:" + Arrays.toString(res));
    }
}
