package hackerrank.stringpractice;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("He is a very very good boy, isn't he?", "!,?._'@ ");
		System.out.println(s.countTokens());
		while (s.hasMoreTokens()){
			System.out.println(s.nextToken());
		}
	}
}
