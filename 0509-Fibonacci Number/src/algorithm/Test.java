package algorithm;

class Solution {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int a = 0;
        int b = 1;
        int res = 0;
        for (int i = 2; i <=N; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int count = solution.fib(4);
        System.out.println("总数:" + count);
    }
}
