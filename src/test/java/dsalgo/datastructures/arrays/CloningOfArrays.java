package dsalgo.datastructures.arrays;

public class CloningOfArrays {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3};
        int cloneArray[] = intArray.clone();
        System.out.println(String.format("Deep copy: %b", intArray == cloneArray));
//     prints false, because when cloned a deep copy is performed for 1-D array, the values are copied not only the references
        for (int i : cloneArray)
            System.out.print(i + " ");

        int intArray2D[][] = {{1, 2, 3}, {4, 5}};
        int cloneArray2D[][] = intArray2D.clone();
        System.out.println(String.format("\nShallow copy: %b", intArray2D == cloneArray2D));
    }
}
