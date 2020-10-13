package dsalgo.problemsolving.leetcode.easy;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class ValidPallindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPallindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
