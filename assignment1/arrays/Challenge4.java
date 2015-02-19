package chandana.assignment1.arrays;

import java.util.Scanner;

public class Challenge4 {
	
	public static void main(String[] args ){
		byte a;
		int[][] A,B,c;
		Scanner input = new Scanner(System.in);
		MatrixMultiplication MM;
		while(true){
			System.out.println("Choose one of the following options:\n1.Matrix Multiplication\n2.Exit");
			a = input.nextByte();
			switch (a){
				case 1:
				System.out.println("Matrix multiplication A x B.\nEnter the order of Matrix A");
				byte r1 = input.nextByte();
				byte c1 = input.nextByte();
				System.out.println("Enter the order of Matrix B");
				byte r2 = input.nextByte();
				byte c2 =input.nextByte();
				if(c1 != r2){
					System.out.println("Matrix multiplication is not possible");
				}
				else{
					A = new int[r1][c1];
					B = new int[r2][c2];
					System.out.println("Enter Array A");
					for(int i=0;i< A.length;i++){
						for(int j=0;j<A[i].length;j++){
							A[i][j] = input.nextInt();
						}
					}
					System.out.println("Enter Array B");
					for(int i=0;i< B.length;i++){
						for(int j=0;j<B[i].length;j++){
							B[i][j] = input.nextInt();
						}
					}
					MM = new MatrixMultiplication(A,B);
					c = MM.multiply(c2);
					System.out.println("Result:");
					for(int i=0;i< c.length;i++){
						for(int j=0;j<c[i].length;j++){
							System.out.print(c[i][j]+"\t");
						}
						System.out.println();
					}
				}
				break;
				case 2:
				System.out.println("You chose to Exit");
				System.exit(0);
				input.close();
				break;
				default:
				System.out.println("Please choose a valid option");
				break;

			}
		}
		
	}
}
