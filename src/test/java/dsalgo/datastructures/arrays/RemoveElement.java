package dsalgo.datastructures.arrays;

/*
 * Created by : vedikagupta
 * Date : 28/09/20
 */
public class RemoveElement {
    private static int[] arr;

    public static void main(String[] args) {
        int count = new RemoveElement().removeElement(new int[]{4, 5}, 4);
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        boolean flag = false;
        for (int i : nums) {
            if (i == val) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return nums.length;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[j++] = nums[i];
        }
        arr = nums;
        return j;
    }
}