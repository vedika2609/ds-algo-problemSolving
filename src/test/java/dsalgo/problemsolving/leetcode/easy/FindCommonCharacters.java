package dsalgo.problemsolving.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        List<String> str = new FindCommonCharacters().commonChars(new String[]{"bella", "label", "roller"});
        for (String s : str)
            System.out.print(s + " ");
    }

    private List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (int i = 0; i < A[0].length(); i++) {
            f1[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                if (A[0].contains(String.valueOf(A[i].charAt(j)))) {
                    f2[A[i].charAt(j) - 'a']++;
                }
            }
            for (int k = 0; k < f1.length; k++) {
                f1[k] = Math.min(f1[k], f2[k]);
                f2[k] = 0;
            }
        }

        for (int i = 0; i < f1.length; i++) {
            char c = (char) ('a' + i);
            for (int j = 0; j < f1[i]; j++)
                result.add(Character.toString(c));
        }
        return result;
    }
}