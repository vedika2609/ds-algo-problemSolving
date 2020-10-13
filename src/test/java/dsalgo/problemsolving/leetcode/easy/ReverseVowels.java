package dsalgo.problemsolving.leetcode.easy;

import java.util.Arrays;
import java.util.List;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */
public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("aA"));
    }

    private String reverseVowels(String s) {
        Character[] vowelArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> vowels = Arrays.asList(vowelArr);
        char[] s1 = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!vowels.contains(s1[i])) {
                i++;
                continue;
            }
            if (!vowels.contains(s1[j])) {
                j--;
                continue;
            }
            char t = s1[i];
            s1[i++] = s1[j];
            s1[j--] = t;
        }
        return String.copyValueOf(s1);
    }
}
