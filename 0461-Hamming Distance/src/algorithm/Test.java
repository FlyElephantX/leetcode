package algorithm;

class Solution {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        while (res != 0) {
            if ((res & 1) == 1) {
                count++;
            }
            res = res >> 1;
        }
        return count;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.hammingDistance(2,4);
        System.out.println("汉明码距离:" + res);
    }
}
