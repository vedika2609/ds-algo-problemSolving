package dsalgo.problemsolving.arcesium;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Map<Integer, Integer> fMap = new HashMap<>();
        for (int i : arr)
            fMap.put(i, fMap.getOrDefault(i, 0) + 1);

        for (Integer i : fMap.keySet()) {
            if (fMap.get(i) > arr.length / 2) {
                System.out.println(i);
                System.exit(1);
            }
        }
        System.out.println(-1);

    }
}