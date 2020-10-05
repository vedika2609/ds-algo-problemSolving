package dsalgo.problemsolving.leetcode;

/*
 * Created by : vedikagupta
 * Date : 28/09/20
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
    }

    private int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        String[] arr = s.split(" ");
        if (arr.length == 0)
            return 0;
        String lastWord = arr[arr.length - 1];
        return lastWord.length();
    }
}
