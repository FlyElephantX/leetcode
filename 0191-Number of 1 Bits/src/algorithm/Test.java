package algorithm;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int count = solution.hammingWeight(6);
        System.out.println("1的个数:" + count);
    }
}
