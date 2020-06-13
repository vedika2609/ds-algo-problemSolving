package dsalgo.algos.problemsolving.string;

public class MakingAnagrams {
    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int deletionCount = 0;
        int[] aFrequencies = new int[26];
        int[] bFrequencies = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int currentChar = (int) a.charAt(i);
            int position = currentChar - (int) 'a';
            aFrequencies[position]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int currentChar = (int) b.charAt(i);
            int position = currentChar - (int) 'a';
            bFrequencies[position]++;
        }

        for (int i = 0; i < 26; i++) {
            int diff = Math.abs(aFrequencies[i] - bFrequencies[i]);
            deletionCount += diff;
        }
        System.out.println(deletionCount);
    }
}
