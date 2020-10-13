package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 07/10/20
 */
public class PrefixWord {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(new PrefixWord().isPrefixOfWord(sentence, searchWord));
    }

    private int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentenceArray = sentence.split(" ");
        int length = searchWord.length();
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].length() >= length)
                if (sentenceArray[i].substring(0, length).equals(searchWord))
                    return i + 1;
        }
        return -1;
    }
}
