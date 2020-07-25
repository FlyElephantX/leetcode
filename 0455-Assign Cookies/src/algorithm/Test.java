package algorithm;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g = {1,2};
        int[] s = {1,2,3};
        int res = solution.findContentChildren(g,s);
        System.out.println("满足的结果:" + res);
    }
}
