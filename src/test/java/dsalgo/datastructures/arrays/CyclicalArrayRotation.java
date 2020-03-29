package dsalgo.datastructures.arrays;

import java.util.Arrays;

public class CyclicalArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        cyclicalRotation(arr);
    }

    private static void cyclicalRotation(int[] arr) {
        int n = arr.length - 1;
        int temp = arr[n];
        for (int i = n; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
        Arrays.stream(arr).forEach(System.out::println);
    }
}
