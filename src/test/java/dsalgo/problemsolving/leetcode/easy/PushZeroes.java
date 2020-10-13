package dsalgo.problemsolving.leetcode.easy;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 01/10/20
 */
public class PushZeroes {
    private static int[] nums;

    public static void main(String[] args) {
        nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
    }

    private static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i];
        }
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }
}
