package dsalgo.problemsolving.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */
public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharInString().firstUniqChar(""));
    }

    private int firstUniqChar(String s) {
        if (s.isEmpty())
            return -1;
        if (s.length() == 1)
            return 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        if (!charFrequencyMap.containsValue(1))
            return -1;
        for (int i = 0; i < n; i++) {
            if (charFrequencyMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}