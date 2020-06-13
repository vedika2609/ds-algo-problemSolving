package dsalgo.algos.problemsolving.leetcode.week1;

/**
 * Created by vedikagupta on 13/06/20
 */

public class ReverseAString {
    public static void main(String[] args) {
        char[] s = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};
        int n = s.length - 1;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
        System.out.println(s);

    }
}
