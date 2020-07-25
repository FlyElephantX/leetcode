package algorithm;

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int mod = n % 7;
            n = n / 7;
            sb.insert(0, mod);
        }
        if (num < 0) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = solution.convertToBase7(-7);
        System.out.println("输出结果:" + res);
    }
}
