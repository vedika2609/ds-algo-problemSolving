package dsalgo.problemsolving.leetcode.easy;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class ArrayPartitionInThreePartsWithEqualSum {
    public static void main(String[] args) {
        System.out.println(new ArrayPartitionInThreePartsWithEqualSum().canThreePartsEqualSum(new int[]{14, 6, -10, 2, 18, -7, -4, 11}));
    }

    private boolean canThreePartsEqualSum(int[] A) {
        int n = A.length;
        if (n < 3)
            return false;
        int sum = Arrays.stream(A).sum();
        if (sum % 3 != 0)
            return false;
        int i = 0;
        int sum1 = sum / 3;
        int sum2 = 2 * sum1;
        int preSum = 0;
        while (i < n - 2) {
            preSum += A[i];
            if (preSum == sum1 && sum - preSum == sum2)
                return true;
            i++;
        }
        return false;
    }
}
