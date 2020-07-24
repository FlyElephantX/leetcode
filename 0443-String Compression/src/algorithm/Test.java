package algorithm;

class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int start = 0;
        for (int i =0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i+1]) {
                chars[write++] = chars[i];
                if (i > start) {
                    String str = "" + (i - start + 1);
                    for (char cur : str.toCharArray()) {
                        chars[write++] = cur;
                    }
                }
                start = i + 1;
            }
        }
        return write;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = solution.compress(chars);
        System.out.println("压缩长度:" + len);
    }
}
