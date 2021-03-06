package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */
public class UnionAndIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        new UnionAndIntersectionOfSortedArrays().printUnion(arr1, arr2);
        System.out.println();
        new UnionAndIntersectionOfSortedArrays().printIntersection(arr1, arr2);
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    private void printUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr1[i] > arr2[j])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while (i < m)
            System.out.print(arr1[i++]);
        while (j < n)
            System.out.print(arr2[j++] + " ");
    }

    private void printIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
}