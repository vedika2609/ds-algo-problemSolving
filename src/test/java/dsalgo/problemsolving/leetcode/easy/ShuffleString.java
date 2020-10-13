package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 12/10/20
 */
public class ShuffleString {
    public static void main(String[] args) {
        String s = "art";
        int[] indices = {1, 0, 2};
        System.out.println(new ShuffleString().restoreString(s, indices));
    }

    private String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.setCharAt(indices[i], s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
