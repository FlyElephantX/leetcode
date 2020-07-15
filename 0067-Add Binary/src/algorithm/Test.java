package algorithm;

class Solution {
    public String addBinary(String a, String b) {
        int len = a.length() < b.length() ? a.length() : b.length();
        String str = "";
        int carry = 0;
        for (int i = 0; i < len; i++) {
            char a1 = a.charAt(a.length() - 1 - i);
            char b1 = b.charAt(b.length() - 1 - i);
            int num = Character.getNumericValue(a1) + Character.getNumericValue(b1) + carry;
            carry = num / 2;
            str = num % 2 + str;
        }
        if (a.length() > len) {
            for (int i = 0; i < a.length() - len; i ++) {
                char a1 = a.charAt(a.length() - len - 1 - i);
                int num = Character.getNumericValue(a1) + carry;
                carry = num / 2;
                str = num % 2 + str;
            }
        }
        if (b.length() > len) {
            for (int i = 0; i < b.length() - len; i ++) {
                char b1 = b.charAt(b.length() - len - 1 - i);
                int num = Character.getNumericValue(b1) + carry;
                carry = num / 2;
                str = num % 2 + str;
            }
        }
        if (carry > 0) {
            str = "1" + str;
        }
        return str;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "1";
        String b = "111";
        String res = solution.addBinary(a, b);
        System.out.println("结果:" + res);
    }
}
