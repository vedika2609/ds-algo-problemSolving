package dsalgo.algos.problemsolving;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vedikagupta on 12/04/20
 */

class GameOfThronesI {
    public static void main(String[] args) {
        String s = "aaabbbb";

        List<Character> distinctChars = s.chars().distinct().mapToObj(x -> (char) x).collect(Collectors.toList());
        List<Character> chars = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        int singleCharCount = 0;
        for (char x : distinctChars) {
            int count = Collections.frequency(chars, x);
            if (count % 2 != 0)
                singleCharCount++;

            if (singleCharCount > 1 && count % 2 != 0) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}