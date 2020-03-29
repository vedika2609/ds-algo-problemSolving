package dsalgo.datastructures.arrays;

public class PairWithGivenSumInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int x = 16;
        System.out.println(pairsCount(arr, x));
    }

    private static int pairsCount(int[] arr, int x) {
        int pivotIndex;
        int n = arr.length;
        for (pivotIndex = 0; pivotIndex < arr.length; pivotIndex++) {
            if (arr[pivotIndex] > arr[pivotIndex + 1])
                break;
        }
        int left = (pivotIndex + 1) % n;
        int right = pivotIndex;

        int count = 0;

        while (left != right) {
            if (arr[left] + arr[right] == x) {
                count++;
                if (left == (right - 1 + n) % n)
                    return count;
                left = (left + 1) % n;
                right = (right - 1 + n) % n;
            } else if (arr[left] + arr[right] < x)
                left = (left + 1) % n;
            else
                right = (n + right - 1) % n;
        }
        return count;
    }
}