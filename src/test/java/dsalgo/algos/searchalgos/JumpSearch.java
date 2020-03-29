package dsalgo.algos.searchalgos;

import org.apache.commons.lang3.ArrayUtils;

//complexity: O(n^0.5)

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 3;
        System.out.println(jumpSearch(arr, x));

    }

    private static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int iteration = -1;
        for (int i = 0; i <= n - step; i = i + step) {
            iteration++;
            if (arr[i] <= x && x <= arr[i + step - 1]) {
                int index = iteration * step + linearSearch(ArrayUtils.subarray(arr, i, i + step), x);
                return index;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
