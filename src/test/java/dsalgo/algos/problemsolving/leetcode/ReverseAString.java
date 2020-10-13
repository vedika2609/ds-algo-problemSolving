package dsalgo.algos.problemsolving.leetcode;

/**
 * Created by vedikagupta on 13/06/20
 */

public class ReverseAString {
    public static void main(String[] args) {
        char[] s = "A man a plan a canal: Panama".toCharArray();
        int start = 0;
        int end = s.length - 1;
        new ReverseAString().reverse(s, start, end);
        System.out.println(s);
    }

    public void reverse(char[] c, int start, int end) {
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
}
