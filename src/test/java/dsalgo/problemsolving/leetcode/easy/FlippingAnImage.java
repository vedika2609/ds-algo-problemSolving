package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        //System.out.println(Arrays.asList(new FlippingAnImage().flipAndInvertImage()));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = reversedArray(A[i]);
        }

        for (int[] arr : A) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    arr[i] = 1;
                else
                    arr[i] = 0;
            }
        }
        return A;
    }

    private int[] reversedArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}