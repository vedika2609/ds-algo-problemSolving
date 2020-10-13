package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 08/10/20
 */
public class GreatString {
    public static void main(String[] args) {
        System.out.println(new GreatString().makeGood("s"));
    }

    private String makeGood(String s) {
        if (s.length() == 1)
            return s;
        return getGoodString(s);
    }

    private String getGoodString(String s) {
        if (isGoodString(s))
            return s;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (goodChars(sb.charAt(i), sb.charAt(i + 1))) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = i - 1;
            }
        }
        return getGoodString(sb.toString());
    }

    private boolean isGoodString(String s) {
        if (s.length() == 2)
            if (goodChars(s.charAt(0), s.charAt(1)))
                return false;

        for (int i = 0; i < s.length() - 2; i++) {
            if (goodChars(s.charAt(i), s.charAt(i + 1)))
                return false;
        }
        return true;
    }

    private boolean goodChars(char a, char b) {
        return Math.abs(a - b) == 32;
    }
}
