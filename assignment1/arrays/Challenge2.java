package chandana.assignment1.arrays;

import java.util.Scanner;


public class Challenge2 {

	public static void main(String[] args) {
	int a,ele;
	Scanner input = new Scanner(System.in);
	SortArray SA = new SortArray();
	while(true){
		System.out.println("Choose one of the following options:\n1.Sort\n2.Add element\n3.Exit");
		a = input.nextInt();
		switch (a){
			case 1:
			SA.sort();
			break;
			case 2:
			System.out.println("Please enter the element to be added into array");
			ele = input.nextInt();
			SA.insertElement(ele);
			break;
			case 3:
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
