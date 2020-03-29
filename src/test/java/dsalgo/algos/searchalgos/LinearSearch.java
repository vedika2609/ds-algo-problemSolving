package dsalgo.algos.searchalgos;

//complexity:  O(n)
public class LinearSearch {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 7, 1};
        Integer x = 3;
        String printStatement = null;

        for (Integer i : arr)
            printStatement = i == x ? "Found" : "Not found";

        System.out.println(printStatement);
    }
}
