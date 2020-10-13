package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 23/09/20
 */
public class RemoveDuplicatedFromSortedArray {
    private int[] nums;

    public static void main(String[] args) {
        RemoveDuplicatedFromSortedArray removeDuplicates = new RemoveDuplicatedFromSortedArray();
        removeDuplicates.nums = new int[]{1, 1, 2};
        int n = removeDuplicates.removeDuplicates();
        for (int i = 0; i < n; i++) {
            System.out.print(removeDuplicates.nums[i] + " ");
        }
    }

    private int removeDuplicates() {
        int n = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] < nums[i + 1])
                n++;
            else
                nums[i] = nums[i + 1];
        }
        return n;
    }
}