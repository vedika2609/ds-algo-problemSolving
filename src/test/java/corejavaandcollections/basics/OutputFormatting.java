package corejavaandcollections.basics;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            String spaces = StringUtils.repeat(" ", 15 - (s1.length()));
            String num = String.format("%03d", x);
            System.out.println(s1 + spaces + num);
        }
        System.out.println("================================");
    }
}
