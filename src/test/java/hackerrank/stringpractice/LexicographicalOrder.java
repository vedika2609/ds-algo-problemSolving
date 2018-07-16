package hackerrank.stringpractice;

import java.util.ArrayList;

public class LexicographicalOrder {

	public static void main(String [] args) {
		//Lexicographical Order

		String s = "welcometojava";
		String smallest = "";
		String largest = "";
		int k = 3;
		String temp;
		ArrayList<String> al = new ArrayList();
		for (int i=0; i < s.length()-2; i++) {
			al.add(s.substring(i, i+3));
		}
		//				System.out.println(al);
		for (int j=0; j<al.size(); j++) {
			for (int l=1+j; l<al.size(); l++) {
				String s1 = al.get(j);
				String s2 = al.get(l);
				int x = (s1.compareTo(s2));
				if (x>0) {
					temp = al.get(j);
					al.set(j, al.get(l));
					al.set(l, temp);
					//System.out.println(al);
				}
			}
		}

		//System.out.println(al);
		smallest = al.get(0);
		largest = al.get(al.size()-1);
		System.out.println(smallest + "\n" + largest);
	}
}
