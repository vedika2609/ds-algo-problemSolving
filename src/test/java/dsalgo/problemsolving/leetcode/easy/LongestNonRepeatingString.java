package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 03/10/20
 */
public class LongestNonRepeatingString {
    public static void main(String[] args) {
        System.out.println(new LongestNonRepeatingString().lengthOfLongestSubstring("dvdf"));
    }

    private int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        int size = Integer.MIN_VALUE;
        String maxString = "";
        for (int i = 0; i < s.length(); i++) {
            if (contains(maxString, s.charAt(i))) {
                maxString = charToString(s.charAt(i));
                //size = 0;
            } else
                maxString += s.charAt(i);

            if (maxString.length() > size)
                size = maxString.length();
        }
        return size;
    }

    private boolean contains(String s, char c) {
        return s.contains(charToString(c));
    }

    private String charToString(char c) {
        return Character.toString(c);
    }
}
