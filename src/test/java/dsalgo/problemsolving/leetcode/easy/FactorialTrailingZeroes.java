package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeroes().trailingZeroes(7));
    }

    private int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i = i * 5) {
            count += n / i;
        }
        return count;
    }
}