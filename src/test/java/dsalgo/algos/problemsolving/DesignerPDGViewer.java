package dsalgo.algos.problemsolving;

/**
 * Created by vedikagupta on 11/04/20
 */

class DesignerPDGViewer {
    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        int aAsci = (int) 'a';

        int maxHeight = 1;

        for (char a : word.toCharArray()) {
            int height = h[(int) a - aAsci];
            if (height > maxHeight)
                maxHeight = height;
        }
        System.out.println(maxHeight * word.length());
    }

}
