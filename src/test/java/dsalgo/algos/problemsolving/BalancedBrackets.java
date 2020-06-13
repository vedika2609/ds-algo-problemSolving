package dsalgo.algos.problemsolving;

import java.util.Stack;

/**
 * Created by vedikagupta on 16/04/20
 */

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{}))";
        if (s.length() % 2 != 0 || (s.charAt(0) == '}') || (s.charAt(0) == ')') || (s.charAt(0) == ']')) {
            System.out.println("NO");
            System.exit(0);
        }

        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            flag = false;
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if (!stack.isEmpty()) {
                    char c = stack.peek();
                    if ((c == '[' && ch == ']') ||
                            (c == '{' && ch == '}') ||
                            (c == '(' && ch == ')')) {
                        stack.pop();
                        flag = true;
                    } else break;
                }
            }
        }
        String msg = flag ? "YES" : " NO ";
        System.out.println(msg);
    }
}
