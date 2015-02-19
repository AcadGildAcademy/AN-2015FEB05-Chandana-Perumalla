package chandana.javaAssignment2.interfaces;

import java.util.Scanner;


public class Challenge1 {

	public static void main(String[] args) {
		char option;
		int a,b;
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Please select one of the following options:\n1.Draw Rectangle\n2.Draw Circle\n3.Exit");
			option = Character.forDigit(input.nextInt(), 10);
			switch(option){
			case '1':
			System.out.println("Please give Rectangle dimensions(length and breadth)");
			a = input.nextInt();
			b = input.nextInt();
			Shape Rect = new Rectangle(a, b);
			Rect.draw();
			System.out.println("The area of the rectangle is: "+Rect.area()+"sq units");
			Rect = null;
     		break;
			case '2':
			System.out.println("Please give radius of circle");
			a = input.nextInt();
			Circle circ = new Circle(a);
			circ.draw();
			System.out.println("Given Radius: "+circ.getRadius()+"\nThe area of the rectangle is: "+circ.area()+"sq units\nThe circumference of circle drawn is: "+circ.circumference()+"units");
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
