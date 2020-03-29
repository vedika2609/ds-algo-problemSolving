package corejavaandcollections.collections;

import java.util.ArrayList;
import java.util.Scanner;

class JavaList {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.nextLine();
        String val = scan.nextLine();
        String[] ls = val.split(" ");
        //		int [] l = new int[n];
        ArrayList<Integer> l = new ArrayList();
        for (int i = 0; i < n; i++) {
            l.add(Integer.parseInt(ls[i]));
        }
        int q = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> out = null;
        while (q > 0) {
            out = querries(l);
            //System.out.println(q);
            q--;
        }
        for (int x = 0; x < out.size(); x++) {
            String s = String.valueOf(out.get(x));
            System.out.print(s + " ");
        }
    }

    private static ArrayList<Integer> querries(ArrayList<Integer> l) {
        String cmd = scan.nextLine();
        if (cmd.equalsIgnoreCase("Insert")) {
            String[] values = scan.nextLine().split(" ");
            int index = Integer.parseInt(values[0]);
            int value = Integer.parseInt(values[1]);
            l.add(index, value);
        } else if (cmd.equalsIgnoreCase("Delete")) {
            int index = scan.nextInt();
            l.remove(index);
        }
        return l;
    }
}
