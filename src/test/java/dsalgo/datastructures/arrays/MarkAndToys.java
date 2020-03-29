package dsalgo.datastructures.arrays;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String[] args) {
        int k = 7;
        int[] prices = {1, 2, 3, 4};
        Arrays.sort(prices);
        int toys = 0;
        int spent = 0;
        while (spent + prices[toys] < k) {
            spent = spent + prices[toys];
            toys++;
        }
        System.out.println(toys);

    }
}
