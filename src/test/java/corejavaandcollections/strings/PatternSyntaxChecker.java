package corejavaandcollections.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        while (testcases > 0) {
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testcases--;
        }
    }

}
