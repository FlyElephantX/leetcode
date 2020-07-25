package algorithm;

class Solution {
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int base = 1;
        int res = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                res = res + base;
            }
            num = num >> 1;
            base = base << 1;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.findComplement(0);
        System.out.println("二进制补数:" + res);
    }
}
