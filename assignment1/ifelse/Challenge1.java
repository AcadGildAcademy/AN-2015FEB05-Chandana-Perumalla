package chandana.assignment1.ifelse;

import java.util.Scanner;

public class Challenge1 {

	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter your age:");
	int age = input.nextInt();
	if(age >18)
		System.out.println("You are eligible for voting");
	else
		System.out.println("You are not eligible for voting");
	input.close();
	}

}
