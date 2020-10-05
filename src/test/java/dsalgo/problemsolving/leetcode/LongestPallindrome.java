package dsalgo.problemsolving.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 01/10/20
 */
public class LongestPallindrome {
    public static void main(String[] args) {
        System.out.println(new LongestPallindrome().longestPalindrome("bb"));
    }

    private int longestPalindrome(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean oddFlag = false;
        for (char c : charMap.keySet()) {
            if (charMap.get(c) == 1)
                oddFlag = true;
            else if (charMap.get(c) % 2 == 0)
                length += charMap.get(c);
            else {
                oddFlag = true;
                length += charMap.get(c) - 1;
            }
        }
        if (oddFlag)
            length++;
        return length;
    }
}
