package algorithm;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int len = haystack.length();
        for (int i = 0; i < len; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (i + j >= len) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int index = solution.strStr("mississippi", "issipi");
        System.out.println("索引位置:" + index);
    }
}
