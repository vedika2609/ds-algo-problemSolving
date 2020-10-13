package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("?6C40E"));
    }

    private String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int start = getStartLetter(s, 0);
        int end = getEndLetter(s, s.length() - 1);
        int n = getLetters(s) / 2;
        while (n >= 1) {
            start = getStartLetter(s, start);
            end = getEndLetter(s, end);
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
            n--;
        }
        return new String(c);
    }

    private int getLetters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if ((c > 64 && c < 91) || (c > 96 && c < 123))
                count++;
        }
        return count;
    }

    private int getStartLetter(String s, int start) {
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c > 64 && c < 91) || (c > 96 && c < 123))
                return i;
        }
        return 0;
    }

    private int getEndLetter(String s, int end) {
        for (int i = end; i > 0; i--) {
            char c = s.charAt(i);
            if ((c > 64 && c < 91) || (c > 96 && c < 123))
                return i;
        }
        return 0;
    }
}
