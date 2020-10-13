package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class StockBuySellOneTime {
    public static void main(String[] args) {
        int[] price = {10, 5, 1};
        System.out.println(new StockBuySellOneTime().maxProfit(price));
    }

    private int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int lowestPriceTillThatDay = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit;
            if (prices[i] > lowestPriceTillThatDay) {
                profit = prices[i] - lowestPriceTillThatDay;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowestPriceTillThatDay = prices[i];
            }
        }
        return maxProfit;
    }
}
