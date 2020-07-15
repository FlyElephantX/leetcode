package algorithm;

import java.awt.print.Pageable;

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String str = countAndSay(n - 1);
        int i = 0;

        String res = "";
        while (i < str.length()) {
            char cur = str.charAt(i);
            int len = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                len++;
                i++;
            }
            res = res + len + cur;
            i++;
        }
        return res;
    }

    public String countAndSay2(int n) {
        StringBuilder builder = new StringBuilder("1");
        int num = 1;
        while (num < n) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < builder.length(); i++) {
                int len = 1;
                while (i < builder.length() - 1 && builder.charAt(i) == builder.charAt(i + 1)) {
                    len++;
                    i++;
                }
                temp.append(len).append(builder.charAt(i));
            }
            builder = temp;
            num++;
        }
        return builder.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = solution.countAndSay2(5);
        System.out.println("结果:" + res);
    }
}
