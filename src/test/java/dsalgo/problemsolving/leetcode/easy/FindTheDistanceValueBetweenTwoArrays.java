package dsalgo.problemsolving.leetcode.easy;
/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */

/**
 * https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */
public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(new FindTheDistanceValueBetweenTwoArrays().findTheDistanceValue(arr1, arr2, d));
    }

    private int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    System.out.println(i + "," + j);
                    count++;
                }
            }
        }
        return count;
    }

}
