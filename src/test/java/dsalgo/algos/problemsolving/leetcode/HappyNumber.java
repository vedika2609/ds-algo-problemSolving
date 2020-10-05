package dsalgo.algos.problemsolving.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vedikagupta on 24/05/20
 */

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }

            if (seen.contains(sum)) {
                System.out.println(false);
                System.exit(0);
            }

            seen.add(sum);
            n = sum;
        }
        System.out.println(true);
    }
}
