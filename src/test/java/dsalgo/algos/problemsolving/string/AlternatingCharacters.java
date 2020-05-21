package dsalgo.algos.problemsolving.string;

/**
 * Created by vedikagupta on 22/05/20
 */

public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "AAAA";
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] == chars[i + 1])
                count++;
        }
        System.out.println(count);
    }
}
