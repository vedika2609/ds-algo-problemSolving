package corejavaandcollections.strings;

public class Palindrome {

	public static void main(String[] args) {

		String s = "madam";
		char[] ch = s.toCharArray();
		System.out.println(ch);
		StringBuilder s1= new StringBuilder(s);
		for (int i=1; i<=s.length(); i++) {
//			System.out.println(i);
//			System.out.println(ch[i-1]);
//			System.out.println(ch[s.length()-i]);
			s1.setCharAt(i-1, ch[s.length()-i] );
			System.out.println(s1);
		}
		System.out.println(s.equalsIgnoreCase(s1.toString()));

	}
}
