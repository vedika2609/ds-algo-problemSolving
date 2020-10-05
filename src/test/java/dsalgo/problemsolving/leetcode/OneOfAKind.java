package dsalgo.problemsolving.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class OneOfAKind {
    public static void main(String[] args) {
        System.out.println(new OneOfAKind().hasGroupsSizeX(new int[]{0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 3, 3, 4, 5, 6}));
    }

    private boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2)
            return false;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.values())
            result = gcd(i, result);
        return result > 1;
    }

    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}