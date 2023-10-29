package Nimbers;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows And Columns 1");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] m1 = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Data in :" + i + "," + j);
				m1[i][j] = sc.nextInt();

			}

		}
		System.out.println("Enter No. of Rows And Columns 2");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int[][] m2 = new int[row][col];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.println("Enter Data in :" + i + "," + j);
				m2[i][j] = sc.nextInt();

			}

		}

		for (int[] r : m1) {
			System.out.println(Arrays.toString(r));

		}
		System.out.println("--------------------");
		for (int[] r : m2) {
			System.out.println(Arrays.toString(r));

		}
		int[][] sum = new int[row][col];

		for (int i = 0; i < row1; i++) {
			System.out.print("[");
			for (int j = 0; j < col1; j++) {

				sum[i][j] = m1[i][j] + m2[i][j];
				System.out.print(sum[i][j]+" ");
				

			}
			System.out.print("]");
			System.out.println();

		}
		
		System.out.println("---------Sum------------");
		for (int[] r : sum) {
			System.out.println(Arrays.toString(r));

		}

	}

}
