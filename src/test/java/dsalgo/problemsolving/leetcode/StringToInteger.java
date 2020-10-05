package dsalgo.problemsolving.leetcode;

/*
 * Created by : vedikagupta
 * Date : 29/09/20
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("+-2"));
    }

    private int myAtoi(String str) {
        if (str.length() == 0)
            return 0;

        if (str.length() == 1) {
            char c = str.charAt(0);
            if ((c > 47 && c < 58))
                return Integer.parseInt(str);
            return 0;
        }
        str = str.replaceAll(" ", "");
        if (str.length() == 0)
            return 0;
        char c = str.toCharArray()[0];
        if (!((c > 47 && c < 58) || (c == 43) || (c == 45)))
            return 0;

        Pattern pattern = Pattern.compile("(-|\\+)(\\d+)");
        Matcher matcher = pattern.matcher(str);
        String s;
        if (matcher.find()) {
            s = matcher.group();
        } else
            return 0;
        Long num = Long.parseLong(s);
        if (num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return Integer.parseInt(s);
    }
}