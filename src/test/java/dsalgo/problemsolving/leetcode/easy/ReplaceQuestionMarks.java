package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 08/10/20
 */
public class ReplaceQuestionMarks {
    public static void main(String[] args) {
        System.out.println(new ReplaceQuestionMarks().modifyString("?"));
    }

    private String modifyString(String s) {
        char regex = '?';
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        if (sb.charAt(0) == regex) {
            if (n == 1) {
                return "a";
            }
            sb.setCharAt(0, getRandomChar(sb.charAt(1)));
        }

        if (sb.charAt(n - 1) == regex)
            sb.setCharAt(n - 1, getRandomChar(sb.charAt(n - 2)));

        if (sb.toString().contains("?")) {
            for (int i = 1; i < n - 1; i++) {
                if (sb.charAt(i) == regex) {
                    sb.setCharAt(i, getRandomChar(sb.charAt(i - 1), sb.charAt(i + 1)));
                }
            }
        }
        return sb.toString();
    }

    private char getRandomChar(char a, char b) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 27; i++) {
            char c = alphabets.charAt(i);
            if (c != a && c != b)
                return c;
        }
        return 'a';
    }

    private char getRandomChar(char a) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 27; i++) {
            char c = alphabets.charAt(i);
            if (c != a)
                return c;
        }
        return 'a';
    }
}
