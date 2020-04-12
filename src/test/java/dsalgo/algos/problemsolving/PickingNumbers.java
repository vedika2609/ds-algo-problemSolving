package dsalgo.algos.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vedikagupta on 11/04/20
 */

class PickingNumbers {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 1, 2};
        List<Integer> a = Arrays.asList(arr);
        List<Integer> count = new ArrayList<>();

        for (Integer i : a) {
            int j = Collections.frequency(a, i) + Collections.frequency(a, i + 1);
            count.add(j);
        }

        System.out.println(Collections.max(count));
    }
}