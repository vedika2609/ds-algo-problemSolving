package dsalgo.problemsolving.interviewprep.array;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new RightRotateArray().rotate(arr, 3);
    }

    private void rotate(int[] nums, int k) {
        int n = nums.length;
        int mod = (n - k) % n;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[(mod + i) % n] + " ");
        }
    }
}
