package dsalgo.algos.problemsolving;

//Hotstar + Razorpay

class MaxProfit {
    public static void main(String[] args) {
        int[] price = {100, 180, 260, 310, 40, 535, 695};
        MaxProfit maxProfitObj = new MaxProfit();
        System.out.println(maxProfitObj.maxProfit(price, 0, price.length - 1));
    }

    private Integer maxProfit(int[] price, int start, int end) {
        int profit = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (price[i] < price[j]) {
                    int currentProfit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, currentProfit);
                }
            }
        }
        return profit;
    }
}