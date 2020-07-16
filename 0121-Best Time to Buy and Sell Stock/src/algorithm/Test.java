package algorithm;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int pre = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - pre;
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - pre;
            if (profit < 0) {
                pre = prices[i];
            } else {
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }
        }
        return maxProfit;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = solution.maxProfit2(prices);
        System.out.println("最大利润:" + maxProfit);
    }
}
