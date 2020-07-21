package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        Solution solution = new Solution();
        solution.reverseString(ch);
        System.out.println("反转结果:" + Arrays.toString(ch));
    }
}
