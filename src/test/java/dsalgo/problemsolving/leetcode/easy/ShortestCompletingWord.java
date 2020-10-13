package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class ShortestCompletingWord {
    public static void main(String[] args) {
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println(new ShortestCompletingWord().shortestCompletingWord("1s3 PSt", words));
    }

    private String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String completingWord = "";
        int[] f1 = getCharFrequencyArray(licensePlate);

        for (String s : words) {
            int[] f2 = getCharFrequencyArray(s);
            if (isCompletingWord(f1, f2) && (s.length() < completingWord.length() || completingWord.isEmpty()))
                completingWord = s;
        }
        return completingWord;
    }

    private boolean isCompletingWord(int[] f1, int[] f2) {
        for (int i = 0; i < f1.length; i++) {
            if (f1[i] > f2[i])
                return false;
        }
        return true;
    }

    private int[] getCharFrequencyArray(String s) {
        int[] charFrequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 96 && c < 123)
                charFrequency[c - 'a']++;
        }
        return charFrequency;
    }
}
