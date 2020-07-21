package algorithm;

class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] list = s.toCharArray();
        while (left < right) {
            while (left < right && !isVowel(list[left])) {
                left++;
            }
            while (left < right && !isVowel(list[right])) {
                right--;
            }
            swap(list, left, right);
            left++;
            right--;
        }
        return new String(list);
    }

    public void  swap(char[] arr, int a, int b) {
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.reverseVowels("leetcode");
        System.out.println("反转结果:" + s);
    }
}
