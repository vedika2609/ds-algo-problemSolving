package dsalgo.algos.searchalgos;

import java.util.Arrays;

//complexity: O(Log n)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 4, 7};
        Arrays.sort(arr);
        int index = binarySearch(arr, 3, 0, arr.length - 1);
        String printStatement = index == -1 ? "Not Found" : "Found at index: " + index;
        System.out.println(printStatement);
    }

    private static int binarySearch(int[] arr, int x, int l, int r) {
        if (l < r) {
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, x, l, mid - 1);
            return binarySearch(arr, x, mid + 1, r);
        }
        return -1;
    }
}
