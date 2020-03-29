package dsalgo.datastructures.arrays;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        int i = 0;
        int jump = 0;
        while (i + 2 < c.length) {
            if (c[i + 2] == 0) {
                i = i + 2;
                jump++;
            } else if (c[i + 1] == 0) {
                i = i + 1;
                jump++;
            }
        }
        if (i != c.length - 1)
            jump++;
        System.out.println(jump);
    }
}
