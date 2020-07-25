package algorithm;

import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (isOneRow(word)) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }

    public boolean isOneRow(String s) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        Set<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            ch = Character.isLowerCase(ch) ? ch : (char)(ch + 32);
            String cur = "" + ch;
            if (row1.contains(cur)) {
                set.add(0);
            }
            if (row2.contains(cur)) {
                set.add(1);
            }
            if (row3.contains(cur)) {
                set.add(2);
            }
        }
        boolean res = false;
        if (set.size() == 1) {
            res = true;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {"qz","wq","asdddafadsfa","adfadfadfdassfawde"};
        String[] res = solution.findWords(strings);
        System.out.println("同一行的字符串:" + Arrays.toString(res));
    }
}
