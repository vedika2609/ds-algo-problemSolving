package dsalgo.problemsolving.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        System.out.println(new UniqueNumberOfOccurences().uniqueOccurrences(new int[]{3, 5, -2, -3, -6, -6}));
    }

    private boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        Set<Integer> uniqueValues = new HashSet<>(map.values());
        return uniqueValues.size() == map.values().size();

    }
}
