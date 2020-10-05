package dsalgo.algos.problemsolving.leetcode;

/**
 * Created by vedikagupta on 13/06/20
 */

public class ReverseAString {
    public static void main(String[] args) {
        char[] s = "A man a plan a canal: Panama".toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
}
