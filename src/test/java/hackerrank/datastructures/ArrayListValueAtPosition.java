package hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListValueAtPosition {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i=0; i<n; i++) {
			scan.nextLine();
			String[] s = scan.nextLine().split(" ");
			System.out.println(s.toString());
			int m = Integer.parseInt(s[0]);
			for (int j=1; j<=m; j++)
				ar.add(i).add(j-1, Integer.parseInt(s[j]));
		}
		for (int k=0; k<n; k++) {
			for (int l=0; k<ar.get(k).size(); k++) {
				System.out.println(ar.get(k).get(l));
			}
		}
	}
}
