package dsalgo.datastructures.arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int mod = d % arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[(mod + i) % arr.length] + " ");
        }
    }
}
