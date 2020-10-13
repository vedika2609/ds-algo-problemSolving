package dsalgo.problemsolving.leetcode.easy;
/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */

import dsalgo.algos.problemsolving.leetcode.ReverseAString;

import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords.reverseWordsWithStack("Let's take LeetCode contest"));
        System.out.println(reverseWords.reverseWordsWithOn("Let's take LeetCode contest"));
    }

    private String reverseWordsWithOn(String s) {
        ReverseAString rev = new ReverseAString();
        char[] c = s.toCharArray();
        int start = 0, end = 0;
        while (end < c.length) {
            if (c[end] == ' ') {
                rev.reverse(c, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        rev.reverse(c, start, end - 1);
        return new String(c);
    }

    private String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (String str : arr) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(Character.toString(str.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String reverseWordsWithStack(String s) {
        String[] arr = s.split(" ");
        String result = "";

        for (String a : arr) {
            Stack<Character> stack = new Stack<>();
            int i = a.length();
            for (char c : a.toCharArray())
                stack.push(c);


            while (i > 0) {
                result += stack.pop();
                i--;
            }
            result += " ";
        }
        return result.trim();
    }
}
