package dsalgo.algos.problemsolving;

import java.util.Arrays;

/**
 * Created by vedikagupta on 11/04/20
 */

class BirthdayChocoloate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int d = 3;
        int m = 2;
        int n = arr.length;

        int total = 0;
        for (int i = 0; i <= n - m; i++) {
            if (Arrays.stream(arr, i, i + m).sum() == d)
                total++;
        }
        System.out.println(total);
    }
}
