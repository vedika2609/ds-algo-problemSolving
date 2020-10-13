package dsalgo.problemsolving.interviewprep.array;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class MoveZeroes {
    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    private void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i];
        }
        while (count < nums.length)
            nums[count++] = 0;

        for (int i : nums)
            System.out.print(i + " ");
    }
}
