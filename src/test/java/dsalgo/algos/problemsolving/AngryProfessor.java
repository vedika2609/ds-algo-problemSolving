package dsalgo.algos.problemsolving;

import java.util.Arrays;

/**
 * Created by vedikagupta on 12/04/20
 */

class AngryProfessor {
    public static void main(String[] args) {
        int[] arr = {-58, -29, -35, -18, 43, -28, -76, 43, -13, 6};
        int k = 6;

        int count = Arrays.stream(arr).filter(i -> i <= 0).toArray().length;
        String msg = count >= k ? "NO" : "YES";
        System.out.println(msg);
    }
}