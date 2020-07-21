package algorithm;

class Solution {
    public boolean canWinNim(int n) {
        return n % 4 > 0 ? true : false;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 1; i <= 10; i++) {
            boolean res = solution.canWinNim(i);
            System.out.println(i + "个石头的时候结果:" + res);
        }
    }
}
