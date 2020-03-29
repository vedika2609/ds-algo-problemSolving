package corejavaandcollections.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> directory = new HashMap<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            int phone = scan.nextInt();
            directory.put(name, phone);
        }
        scan.nextLine();
//		System.out.println(directory);
        while (scan.hasNext()) {
            String querryName = scan.nextLine();
            if (directory.containsKey(querryName))
                System.out.println(querryName + "=" + directory.get(querryName));
            else
                System.out.println("Not Found");
        }
    }

}
