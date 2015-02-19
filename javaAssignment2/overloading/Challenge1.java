package chandana.javaAssignment2.overloading;

import java.util.Scanner;

public class Challenge1 {
	
	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Instantiating constructor with no parameters");
		Rectangle rect = new Rectangle();
		System.out.println("length: "+rect.length+"breadth: "+rect.breadth+"\nArea of the rectangle: "+rect.area());
		System.out.println("Instantiating constructor with single argument\nEnter input:");
		 a = input.nextInt();
		Rectangle rect1 = new Rectangle(a);
		System.out.println("length: "+rect1.length+"breadth: "+rect1.breadth+"\nArea of the rectangle: "+rect1.area());
		System.out.println("Instantiating constructor with two arguments:\nEnter inputs:");
		a = input.nextInt();
		b = input.nextInt();
		Rectangle rect2 = new Rectangle(a,b);
		System.out.println("length: "+rect2.length+"breadth: "+rect2.breadth+"\nArea of the rectangle: "+rect2.area());
		input.close();
		

	}

}
