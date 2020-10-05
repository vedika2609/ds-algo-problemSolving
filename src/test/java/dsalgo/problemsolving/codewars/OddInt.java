package dsalgo.problemsolving.codewars;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */

import java.util.HashMap;
import java.util.Map;

public class OddInt {
    private static int findIt(int[] a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : a) {
            if (frequencyMap.containsKey(i))
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            else
                frequencyMap.put(i, 1);
        }
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) % 2 != 0)
                return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }
}
