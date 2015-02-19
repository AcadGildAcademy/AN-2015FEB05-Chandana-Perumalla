package chandana.javaAssignment2.inheritance;

public class RectangleArea {
	
	int length;
	int breadth;
	
	public RectangleArea(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public int area(){
		return length*breadth;
	}
}
