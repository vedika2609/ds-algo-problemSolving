package dsalgo.algos.problemsolving;

public class CatsAndAMouse {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = 2;

        if (Math.abs(x - z) < Math.abs((y - z)))
            System.out.println("Cat A");
        else if (Math.abs(x - z) == Math.abs(y - z))
            System.out.println("Mouse C");
        else
            System.out.println("Cat B");
    }
}
