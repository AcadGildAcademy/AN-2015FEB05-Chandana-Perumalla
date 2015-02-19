package chandana.javaAssignment2.overloading;

public class Rectangle {

	int length,breadth;
	
	Rectangle(){
		length = 0;
		breadth = 0;
	}
	Rectangle(int a){
		this.length = this.breadth = a;
	}
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area(){
		return length*breadth;
	}
}
