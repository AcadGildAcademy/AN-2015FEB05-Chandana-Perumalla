package chandana.assignment1.arrays;

import java.util.Random;
import java.util.Scanner;


public class Challenge1 {

	public static void main(String[] args) {
		int size;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the array size");
		size = input.nextInt();
		byte a[] = new byte[size];
		Random randomGenerator = new Random();
		randomGenerator.nextBytes(a);
		
		System.out.println("Array generated:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nReversing the array");
		for(int i=a.length-1;i>-1;i--)
			System.out.print(a[i]+"\t");
		input.close();
	}

}