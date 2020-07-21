package algorithm;

import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public String getHint(String secret, String guess) {
        if (secret.length() == 0 || guess.length() == 0) {
            return "";
        }
        if (secret.length() != guess.length()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (!map.containsKey(secret.charAt(i))) {
                    map.put(secret.charAt(i), 1);
                } else {
                    int count = map.get(secret.charAt(i));
                    map.put(secret.charAt(i), count + 1);
                }
                if (!map2.containsKey(guess.charAt(i))) {
                    map2.put(guess.charAt(i), 1);
                } else {
                    int count = map2.get(guess.charAt(i));
                    map2.put(guess.charAt(i), count + 1);
                }
            }
        }
        for (Character key : map2.keySet()) {
            int n1 = map2.getOrDefault(key, 0);
            int n2 = map.getOrDefault(key, 0);
            cows = cows + Math.min(n1, n2);
        }
        sb.append(bulls + "A");
        sb.append(cows + "B");
        return sb.toString();
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String secret = "1122";
        String guess = "2211";
        String res = solution.getHint(secret, guess);
        System.out.println("返回结果:" + res);
    }
}
