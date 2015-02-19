package chandana.assignment1.switchstatement;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args){
		String month;
		while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month or press exit to exit");
		month = input.next();
		month = month.toLowerCase();
		switch(month){
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			System.out.println("Number of days in the month "+month+": 31");
		break;
		case "april":
		case "june":
		case "september":
		case "november":
			System.out.println("Number of days in the month "+month+": 30");
		break;
		case "february":
				System.out.println("Number of days in the month"+month+": 28");
		break;
		case "exit":
			System.exit(0);
		default:
			System.out.println("Entered data"+month+"\n Please give a valid month name as input");
			break;
		}
		}
	}
}
