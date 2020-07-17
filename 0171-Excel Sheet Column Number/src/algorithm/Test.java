package algorithm;

class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int base = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = s.charAt(i) + 1 - 'A';
            res = res + base * cur;
            base = base * 26;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int val = solution.titleToNumber("ZY");
        System.out.println("转换结果:" + val);
    }
}
