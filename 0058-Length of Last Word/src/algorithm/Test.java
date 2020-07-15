package algorithm;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if (arr.length == 0) {
            return 0;
        } else {
            String str = arr[arr.length - 1];
            return str.length();
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Hello World";
        int len = solution.lengthOfLastWord(str);
        System.out.println("长度:" + len);
    }
}
