package dsalgo.problemsolving.leetcode.easy;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        System.out.println(new LargestPerimeterTriangle().largestPerimeter(new int[]{3, 4, 15, 2, 9, 4}));
    }

    private int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n = A.length - 1;
        int maxPeri = 0;
        for (int i = n; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                maxPeri = A[i] + A[i - 1] + A[i - 2];
                break;
            }
        }
        return maxPeri;
    }
}
