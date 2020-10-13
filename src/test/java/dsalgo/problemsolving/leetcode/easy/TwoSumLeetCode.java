package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 21/09/20
 */

import java.util.Arrays;

public class TwoSumLeetCode {

    private int[] arr;

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumLeetCode twoSum = new TwoSumLeetCode();
        int[] indexesResult = twoSum.twoSum(nums, target);
        Arrays.stream(indexesResult).forEach(x -> System.out.print(x + " "));
    }

    public int[] twoSum(int[] nums, int target) {
        arr = nums;
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            int a = arr[i];
            int b = target - a;
            int index = getIndex(i + 1, b);
            if (index != 0) {
                indexes[0] = i;
                indexes[1] = index;
            }
        }
        return indexes;
    }

    private int getIndex(int i, int b) {
        for (; i < arr.length; i++) {
            if (arr[i] == b)
                return i;
        }
        return 0;
    }
}
