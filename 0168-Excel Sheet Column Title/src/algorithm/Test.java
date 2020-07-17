package algorithm;

class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            int mod = n % 26;
            sb.insert(0, (char)(mod + 'A'));
            n = n / 26;
        }
        return sb.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = solution.convertToTitle(701);
        System.out.println("转换结果:" + str);
    }
}
