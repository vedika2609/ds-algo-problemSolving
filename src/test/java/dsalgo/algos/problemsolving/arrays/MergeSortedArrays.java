package dsalgo.algos.problemsolving.arrays;

/*
 * Created by : vedikagupta
 * Date : 07/09/20
 */
public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 10, 15};
        int[] arr2 = {2, 4, 6, 8, 10};

        int i = 0, j = 0, k = 0;
        int[] arr = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length)
            arr[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];

        while (i < arr1.length)
            arr[k++] = arr1[i++];

        while (j < arr2.length)
            arr[k++] = arr2[j++];

        for (int x : arr)
            System.out.print(x + " ");
    }

}