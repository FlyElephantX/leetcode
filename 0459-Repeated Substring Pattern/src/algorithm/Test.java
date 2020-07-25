package algorithm;

class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i=len / 2; i >= 1; i--) {
            if(len % i == 0) {
                int m = len / i;
                String sub = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < m; j++) {
                    sb.append(sub);
                }
                if(sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "aba";
        boolean res = solution.repeatedSubstringPattern(str);
        if (res) {
            System.out.println("重复字符串");
        } else {
            System.out.println("非重复字符串");
        }
    }
}
