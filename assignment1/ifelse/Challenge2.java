package chandana.assignment1.ifelse;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		if(num == 0)
			System.out.println("0 is neither even nor odd");
		else if(num%2 == 0)
			System.out.println("Given number, "+num+" is even");
		else
			System.out.println("Given number, "+num+" is odd");
        input.close();
	}

}
