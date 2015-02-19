package chandana.javaAssignment2.interfaces;

public class Rectangle implements Shape {
	int length,breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	@Override
	public int area() {	
		return length*breadth;
	}

}
