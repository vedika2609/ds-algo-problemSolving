package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class WordsFormedByCharacters {
    public static void main(String[] args) {
        System.out.println(new WordsFormedByCharacters().countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }

    private int countCharacters(String[] words, String chars) {
        int[] charArray = new int[26];
        int goodWord = 0;
        for (int i = 0; i < chars.length(); i++)
            charArray[chars.charAt(i) - 'a']++;

        for (String word : words) {
            int[] wordArray = new int[26];
            boolean formedByChar = true;
            for (int i = 0; i < word.length(); i++) {
                wordArray[word.charAt(i) - 'a']++;
            }

            for (int i = 0; i < charArray.length; i++)
                if (charArray[i] < wordArray[i]) {
                    formedByChar = false;
                    break;
                }
            if (formedByChar)
                goodWord += word.length();
        }
        return goodWord;
    }
}
