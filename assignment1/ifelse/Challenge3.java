package chandana.assignment1.ifelse;

import java.util.Scanner;

public class Challenge3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an year");
	int year = input.nextInt();
	if(year % 100 == 0){
		if(year % 400 == 0)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
	else if(year%4 == 0)
		System.out.println(year+" is leap year");
	else
		System.out.println(year+" is not leap year");
	input.close();

	}

}
