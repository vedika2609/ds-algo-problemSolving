package dsalgo.algos.problemsolving;

import java.util.Arrays;

/**
 * Created by vedikagupta on 12/04/20
 */

class TheHurdleRace {
    public static void main(String[] args) {
        int[] height = {1, 6, 3, 5, 2};
        int k = 4;

        int maxHeight = Arrays.stream(height).max().getAsInt();
        if (k > maxHeight)
            System.out.println(0);
        else
            System.out.println(maxHeight - k);
    }
}