package corejavaandcollections.basics;

import java.util.Scanner;

public class ExponentialSeries {

    private static void exponent(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum = sum + (int) ((Math.pow(2, i)) * b);
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO Auto-generated method stub
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            exponent(a, b, n);
            System.out.println();
        }
    }
}
