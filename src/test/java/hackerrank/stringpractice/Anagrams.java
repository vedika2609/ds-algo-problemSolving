package hackerrank.stringpractice;

public class Anagrams {

	public static void main(String[] args) {
		String a = "ab";
		String b = "abXY";
		if ((a.length() == b.length()) && (a.length()>=1) && (a.length()<=50)) {
			a = a.toLowerCase();
			b = b.toLowerCase();
			for (int x=0; x<a.length();x++) {
				char one = a.charAt(x);
				System.out.println(one);
				int count =0;
				for (int i = 0; i<a.length(); i++) {
					if (one==a.charAt(i))
						count++;
				}
				int dount =0;
				for (int i = 0; i<b.length(); i++) {
					if (one==b.charAt(i))
						dount++;
				}
				System.out.println(count);
				System.out.println(dount);
				if (count == dount) {
					System.out.println("Anagrmas");
					continue;
				}
				else if (count!=dount){
					System.out.println("Not Anagrams");
					break;
				}
			}
		}
	}
}
