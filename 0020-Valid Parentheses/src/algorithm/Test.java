package algorithm;

import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (!(top =='(' && c == ')' || top =='{' && c == '}' || top == '[' && c == ']')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "([)]";
        boolean isValid = solution.isValid2(str);
        if (isValid) {
            System.out.println(str + "匹配");
        } else {
            System.out.println(str + "不匹配");
        }
    }
}
