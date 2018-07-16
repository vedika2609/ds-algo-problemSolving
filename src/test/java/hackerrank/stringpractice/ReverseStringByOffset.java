package hackerrank.stringpractice;

import java.util.Arrays;

public class ReverseStringByOffset {

	public static void main(String[] args) {
		String str = "vedikagupta";
		char [] A = str.toCharArray();
		int offset = 3;
		int len = A.length;
		offset %= len;
		reverse (A, 0, len-offset-1);
		reverse (A, len-offset, len-1);
		reverse (A, 0, len-1);
		System.out.println("\n"+Arrays.toString(A));
		
		
	}
	
	public static void reverse (char[]str, int start, int end) {
		while(start<end) {
			char temp = str[start];
			str [start] = str[end];
			str [end] = temp;
			start++;
			end--;
			System.out.println(str);
		}
	}
}
