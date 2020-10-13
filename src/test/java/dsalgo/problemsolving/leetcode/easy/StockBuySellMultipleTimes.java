package dsalgo.problemsolving.leetcode.easy;
/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */

public class StockBuySellMultipleTimes {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(new StockBuySellMultipleTimes().maxProfit(prices));
    }

    private int maxProfit(int[] prices) {
        int i = 0;
        int valley;
        int peak;
        int maxProfit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }
}
