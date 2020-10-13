package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 25/09/20
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    private String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        String prefix = "";

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength)
                minLength = strs[i].length();
        }

        while (minLength > 0) {
            boolean diff = false;
            prefix = strs[0].substring(0, minLength);
            for (String s : strs) {
                if (!s.substring(0, minLength).equals(prefix)) {
                    minLength--;
                    diff = true;
                    break;
                }
            }
            if (!diff)
                break;
        }
        return prefix.substring(0, minLength);
    }
}
