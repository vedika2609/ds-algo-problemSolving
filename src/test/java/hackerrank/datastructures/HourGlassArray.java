package hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HourGlassArray {

	public static void main(String[] args) {

		ArrayList<Integer> sum = new ArrayList();
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scan.nextLine().split(" ");
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}



//			for (int k=0; k<n; k++) {
//				for (int l=0; l<n; l++) {
//					arr[k][l] = scan.nextInt();
//				}
//			}
			for (int k=0; k<4; k++) {
				for (int l=0; l<4; l++) {
					int s = arr[k][l+1] + arr[k][l+1] + arr[k][l+2] + arr[k+1][l+1] + arr[k+2][l] + arr[k+2][l+2];
					sum.add(s);
				}
			}
			System.out.println(sum);
			System.out.println(Collections.max(sum));
		}
	}
	
