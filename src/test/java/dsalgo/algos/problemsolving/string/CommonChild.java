package dsalgo.algos.problemsolving.string;

/**
 * Created by vedikagupta on 24/05/20
 */

public class CommonChild {
    public static void main(String[] args) {
        String s1 = "OUDFRMYMAW";
        String s2 = "AWHYFCCMQX";

        CommonChild commonChild = new CommonChild();
        System.out.println(commonChild.lcs(s1, s2));

    }

    private int lcs(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0)
            return 0;

        if (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)) {
            return 1 + lcs(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1));
        }

        return Math.max(lcs(s1, s2.substring(0, s2.length() - 1)), lcs(s1.substring(0, s1.length() - 1), s2));
    }
}
