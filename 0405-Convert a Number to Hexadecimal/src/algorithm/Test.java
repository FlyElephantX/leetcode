package algorithm;

class Solution {
    public String toHex(int num) {
        if(num == 0) {
            return "0";
        }
        String str = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int index = num & 15;
            sb.insert(0, str.charAt(index));
            num = num >>> 4;
        }
        return sb.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = solution.toHex(26);
        System.out.println("转换结果:" + res);
    }
}
