//package dsalgo.algos.problemsolving.thirtydaysofcode;
//
///*
// * Created by : vedikagupta
// * Date : 09/08/20
// */
//
//import java.util.Arrays;
//import java.util.List;
//
//public class MaxProfit {
//
//    public static long maxProfit(int[] price) {
//        int begin = 0;
//        int n = price.length();
//        int end = n-1;
//        if (price[begin][end] != -1)
//            return price[begin][end];
//
//        int year = n - (end - begin);
//
//        if (begin == end)
//            return year * price[begin];
//
//        // x = maximum profit on selling the
//        // wine from the front this year
//        int x = price[begin] * year +
//                maxProfitUtil(price, begin + 1,
//                        end, n);
//
//        // y = maximum profit on selling the
//        // wine from the end this year
//        int y = price[end] * year +
//                maxProfitUtil(price, begin,
//                        end - 1, n);
//
//        int ans = Math.max(x, y);
//        price[begin][end] = ans;
//
//        if (x >= y)
//            sell[begin][end] = 0;
//        else
//            sell[begin][end] = 1;
//
//        return ans;
//    }
//
//}
//
//    public static void main(String[] args) {
//        Integer[] arr = {1,2,100};
//        maxProfit(Arrays.asList(arr));
//    }
//}