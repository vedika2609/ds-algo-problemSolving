package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 23/09/20
 */

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }

    private int reverse(int x) {
        long reversed = 0;
        int sign = x > 0 ? 1 : -1;

        x = Math.abs(x);
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (reversed * sign > Integer.MAX_VALUE || reversed * sign < Integer.MIN_VALUE)
            return 0;
        else
            return (int) reversed * sign;
    }
}
