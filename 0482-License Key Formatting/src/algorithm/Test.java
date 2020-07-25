package algorithm;

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for (char ch : S.toCharArray()) {
            if (ch != '-') {
                sb.append(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        int len = K;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (len > 0) {
                res.append(sb.charAt(i));
                len--;
            } else {
                len = K;
                res.append('-');
                res.append(sb.charAt(i));
                len--;
            }
        }
        return res.reverse().toString().toUpperCase();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "2-5g-3-J";
        String res = solution.licenseKeyFormatting(s, 2);
        System.out.println("格式化结果:" + res);
    }
}
