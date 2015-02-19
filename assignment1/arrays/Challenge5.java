package chandana.assignment1.arrays;

import java.util.Scanner;

public class Challenge5 {
	static int r,c;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the order of two dimensional matrix");
		r = input.nextInt();
		c = input.nextInt();
		int[][] a = new int[r][c];
		
		System.out.println("Dimension: "+a.length+":"+a[0].length);
		input.close();
	}

}