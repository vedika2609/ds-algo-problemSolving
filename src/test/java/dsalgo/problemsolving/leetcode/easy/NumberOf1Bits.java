package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(new NumberOf1Bits().hammingWeight(00000000000000000000000000001011));
    }

    private int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 != 0)
                count++;
            n = n / 10;
        }
        return count;
    }
}
