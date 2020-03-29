package dsalgo.datastructures.arrays;

/*Reversal algorithm
Time Complexity : O(n)
   */

import java.util.Arrays;

public class LeftArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 11, 2, 3, 5};
        int n = 2;
        leftRotation(arr, n);
    }

    private static void leftRotation(int[] arr, int n) {
        arrayReversal(arr, 0, n - 1);
        arrayReversal(arr, n, arr.length - 1);
        arrayReversal(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void arrayReversal(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
