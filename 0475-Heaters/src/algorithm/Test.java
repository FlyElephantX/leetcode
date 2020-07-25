package algorithm;

import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        int radius = Integer.MIN_VALUE;
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = - (index + 1);
            }
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
            radius = Math.max(radius, Math.min(dist1, dist2));
        }
        return radius;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] houses = {1,2,3,4};
        int[] heaters = {1,4};
        int radius = solution.findRadius(houses, heaters);
        System.out.println("最大路径:" + radius);
    }
}
