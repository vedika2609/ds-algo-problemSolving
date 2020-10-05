package dsalgo.problemsolving.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(new BuddyStrings().buddyStrings("AB", "AB"));
    }

    private boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            aMap.put(a, aMap.getOrDefault(a, 0) + 1);
            bMap.put(b, bMap.getOrDefault(b, 0) + 1);
        }

        for (char c : aMap.keySet()) {
            if (!aMap.get(c).equals(bMap.get(c)))
                return false;
        }
        int swapCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i))
                swapCount++;
        }
        return swapCount <= 2;
    }
}
