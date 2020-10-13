package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 29/09/20
 */

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("a good   example"));
    }

    private String reverseWords(String s) {
        if (s.length() == 0)
            return "";
        String[] sentence = s.split(" ");
        String result = "";
        for (int i = sentence.length - 1; i >= 0; i--) {
            if (!sentence[i].equals(""))
                result += sentence[i].trim() + " ";
        }
        return result.trim();
    }
}
