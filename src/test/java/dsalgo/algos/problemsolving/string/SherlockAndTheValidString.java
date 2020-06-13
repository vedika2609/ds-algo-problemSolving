package dsalgo.algos.problemsolving.string;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {
    public static void main(String[] args) {
        String s = "aaafffg";

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i : s.chars().distinct().toArray()) {
            if (!charFrequency.containsKey((char) i))
                charFrequency.put((char) i, (int) s.chars().filter(x -> x == (char) i).count());
        }
        Integer[] countsArray = charFrequency.values().stream().toArray(Integer[]::new);

        if (isAllSame(countsArray)) {
            System.out.println("YES");
            System.exit(0);
        }

        for (int i = 0; i < countsArray.length; i++) {
            countsArray[i] += -1;
            if (isAllSame(countsArray)) {
                System.out.println("YES");
                System.exit(0);
            }
            countsArray[i] += 1;

        }
        System.out.println("NO");
    }

    private static boolean isAllSame(Integer[] arr) {
        int first = arr[0];
        for (int i : arr) {
            if (i != first && i != 0)
                return false;
        }
        return true;
    }
}
