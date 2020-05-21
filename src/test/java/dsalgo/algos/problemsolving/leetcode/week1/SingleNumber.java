package dsalgo.algos.problemsolving.leetcode.week1;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                break;
            }

        }
    }
}
