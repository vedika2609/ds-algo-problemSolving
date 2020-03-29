package corejavaandcollections.basics;

import java.util.Scanner;

public class LoopsIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n%2!=0)
			System.out.println("Weird");
		else if (n>1 && n<6)
			System.out.println("Not Weird");
		else if (n>5 && n<21)
			System.out.println("Weird");
		else 
			System.out.println("Not Weird");
		
	}
}
