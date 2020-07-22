package algorithm;

class GuessGame {

    public int guess(int n) {
        if (n == 6) {
            return 0;
        } else if (n < 6) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n) == 0) {
            return n;
        }
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.guessNumber(8);
        System.out.println("结果:" + res);
    }
}
