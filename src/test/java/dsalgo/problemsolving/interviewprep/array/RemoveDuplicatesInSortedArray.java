package dsalgo.problemsolving.interviewprep.array;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesInSortedArray().removeDuplicates(new int[]{1, 1, 2}));
    }

    private int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        nums[j++] = nums[i++];
        while (i < nums.length) {
            if (nums[i - 1] < nums[i]) {
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;
    }
}
