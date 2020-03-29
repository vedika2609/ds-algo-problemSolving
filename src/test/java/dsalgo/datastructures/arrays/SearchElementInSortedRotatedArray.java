package dsalgo.datastructures.arrays;

/*
 * O(log n)
 * */
public class SearchElementInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        int index = search(arr, key, 0, arr.length - 1);
        String statement = index == -1 ? "Not Found" : "Index: " + index;
        System.out.println(statement);
    }

    private static int search(int[] arr, int key, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right)
            return -1;

        if (arr[mid] == key)
            return mid;

        else if (arr[left] <= arr[mid]) {
            if (key > arr[0] && key <= arr[mid])
                return search(arr, key, left, mid - 1);
            else
                return search(arr, key, mid + 1, right);
        } else {
            if (key > arr[mid] && key <= arr[right])
                return search(arr, key, mid + 1, right);
            else
                return search(arr, key, left, mid - 1);
        }
    }
}
