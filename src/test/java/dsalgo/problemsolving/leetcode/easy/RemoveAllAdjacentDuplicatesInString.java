package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(new RemoveAllAdjacentDuplicatesInString().removeDuplicates("aabaacaac"));
    }

    private String removeDuplicates(String s) {
        return removeDuplicateChars(s);
    }

    private String removeDuplicateChars(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length() - 1) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = 0;
            } else
                i++;
        }
        if (sb.length() == 0)
            return "";
        return sb.toString();
    }
}
