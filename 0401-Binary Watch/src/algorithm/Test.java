package algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h * 64 + m) == num) {
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.readBinaryWatch(1);
        System.out.println("可能的时间结果:" + list);
    }
}
