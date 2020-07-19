package algorithm;

import java.util.Arrays;

class Solution {

    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrimes = new boolean[n + 1];
        Arrays.fill(isPrimes, true);
        isPrimes[0] = false;
        if (n > 0 ) {
            isPrimes[1] = false;
        }
        for (int i = 2; i < n; i++) {
            if (!isPrimes[i]) {
                continue;
            }
            count++;
            for (int j = 2; i * j < n; j++) {
                isPrimes[i * j] = false;
            }
        }
        return count;
    }

    public int countPrimes1(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber1(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrimeNumber1(int num) {
        if (num < 2) {
            return false;
        }
        boolean res = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int count = solution.countPrimes(20);
        System.out.println("素数的个数:" + count);
    }
}
