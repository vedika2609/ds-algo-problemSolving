package hackerrank.stringpractice;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class LengthOfString {

	public static void main(String[] args) {

		String A = "Vedikagupta";
		String B = "Java";
		System.out.println(A.length()+B.length());
		int x = A.compareTo(B);
		if (x>0)
			System.out.println("Yes");
		else 
			System.out.println("No");

		System.out.println(StringUtils.capitalize(A)+" "+ StringUtils.capitalize(B)); //capitalize is for camel case 
		System.out.println(A.substring(3, 7));


	}
}
