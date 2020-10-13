package dsalgo.problemsolving.interviewprep.array;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {8, 0, 3};
        int[] arr2 = {0, 0};
        int[] intersection = new IntersectionOfTwoArrays().intersect(arr1, arr2);
        for (int i : intersection)
            System.out.print(i + " ");
    }

    private int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
