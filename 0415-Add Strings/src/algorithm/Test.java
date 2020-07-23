package algorithm;

class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
            return num2;
        }
        if (num2.length() == 0) {
            return num1;
        }
        int len = num1.length() < num2.length() ? num1.length() : num2.length();
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num1);
        if (num1.length() == len) {
            for (int i = 0; i < num2.length() - len; i++) {
                sb1.insert(0, "0");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(num2);
        if (num2.length() == len) {
            for (int i = 0; i < num1.length() - len; i++) {
                sb2.insert(0, "0");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        int carry = 0;
        for (int i = sb1.length() -1; i >= 0; i--) {
            int a = Integer.valueOf("" + sb1.charAt(i));
            int b = Integer.valueOf("" + sb2.charAt(i));
            int sum = a + b + carry;
            int mod = sum % 10;
            sb3.insert(0, mod);
            carry = sum / 10;
        }
        if (carry > 0) {
            sb3.insert(0, carry);
        }
        return sb3.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String num1 = "9";
        String num2 = "99";
        String res = solution.addStrings(num1, num2);
        System.out.println("相加的结果:" + res);
    }
}
