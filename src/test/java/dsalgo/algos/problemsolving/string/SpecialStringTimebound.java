package dsalgo.algos.problemsolving.string;

public class SpecialStringTimebound {
    public static void main(String[] args) {
        String s = "abcbaba";

        long count = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int l = 0;
            int r = 0;
            while (i < s.length() && s.charAt(i) == c) {
                l++;
                i++;
            }
            if (i + 1 < s.length() && s.charAt(i + 1) == c) {
                int index = i;
                int index2 = i + 1;
                i++;
                while (i < s.length() && s.charAt(i) == c) {
                    r++;
                    i++;
                }
                if (i < s.length() && r == 1 && s.charAt(i) == s.charAt(index)) {
                    count += Math.min(l, r) + 1;
                } else {
                    count += Math.min(l, r);
                }
                if (i + 1 < s.length() && s.charAt(index2) == s.charAt(i + 1)) {
                    i = index2;
                }
            }
        }
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            long same = 0;
            while (j < s.length() && s.charAt(j) == c) {
                same++;
                j++;
            }
            j--;
            count += same * (same + 1) / 2;
        }
        System.out.println(count);
    }
}
