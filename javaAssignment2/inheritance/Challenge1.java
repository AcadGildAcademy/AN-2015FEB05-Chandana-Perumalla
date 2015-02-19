package chandana.javaAssignment2.inheritance;

import java.util.Scanner;


public class Challenge1 {

	public static void main(String[] args) {
		char option;
		int a,b;
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Please select one of the following options:\n1.Area of Rectangle\n2.Area of Triangle\n3.Exit");
			option = Character.forDigit(input.nextInt(), 10);
			switch(option){
			case '1':
			System.out.println("Please give Rectangle dimensions(length and breadth)");
			a = input.nextInt();
			b = input.nextInt();
			RectangleArea RA = new RectangleArea(a, b);
			System.out.println("The area of the rectangle is: "+RA.area()+"sq units");
			RA = null;
     		break;
			case '2':
			System.out.println("Please give Triangle dimensions(height and base)");
			a = input.nextInt();
			b = input.nextInt();
			TriangleArea TA = new TriangleArea(a, b);
			System.out.println("The area of the rectangle is: "+TA.getArea()+"sq units");
			TA = null;
			break;
			case'3':
			input.close();
			System.exit(0);
			break;
			default:
			System.out.println("Invalid option.Please press a valid option");
			break;
			}
			
		}
		
		
	}

}
