package algorithm;

class Solution {
    public int findLUSlength(String a, String b) {
        return  a.equals(b) ? - 1 : Math.max(a.length(), b.length());
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "aba";
        String b = "cdc";
        int res = solution.findLUSlength(a, b);
        System.out.println("对比结果:" + res);
    }
}
