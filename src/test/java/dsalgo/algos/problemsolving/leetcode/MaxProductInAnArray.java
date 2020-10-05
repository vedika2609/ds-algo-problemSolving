package dsalgo.algos.problemsolving.leetcode;

import java.util.Arrays;

/**
 * Created by vedikagupta on 04/06/20
 */

public class MaxProductInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 5};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println((nums[n - 1] - 1) * (nums[n - 2] - 1));
    }
}
