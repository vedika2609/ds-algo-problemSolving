package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 23/09/20
 */

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }

    private int romanToInt(String s) {
        int i = 0;
        int num = 0;
        int l = s.length();
        while (i < l) {
            char c = s.charAt(i);
            switch (c) {
                case 'M':
                    num += 1000;
                    i += 1;
                    break;
                case 'D':
                    num += 500;
                    i += 1;
                    break;
                case 'C':
                    if (i + 1 < l && s.charAt(i + 1) == 'D') {
                        num += 400;
                        i += 2;
                        break;
                    }
                    if (i + 1 < l && s.charAt(i + 1) == 'M') {
                        num += 900;
                        i += 2;
                        break;
                    }
                    num += 100;
                    i += 1;
                    break;
                case 'L':
                    num += 50;
                    i += 1;
                    break;
                case 'X':
                    if (i + 1 < l && s.charAt(i + 1) == 'L') {
                        num += 40;
                        i += 2;
                        break;
                    }
                    if (i + 1 < l && s.charAt(i + 1) == 'C') {
                        num += 90;
                        i += 2;
                        break;
                    }
                    num += 10;
                    i += 1;
                    break;
                case 'V':
                    num += 5;
                    i += 1;
                    break;
                case 'I':
                    if (i + 1 < l && s.charAt(i + 1) == 'V') {
                        num += 4;
                        i += 2;
                        break;
                    }
                    if (i + 1 < l && s.charAt(i + 1) == 'X') {
                        num += 9;
                        i += 2;
                        break;
                    }
                    num += 1;
                    i += 1;
                    break;
                default:
                    throw new IllegalArgumentException("Roman literal not found");
            }
        }
        return num;
    }
}
