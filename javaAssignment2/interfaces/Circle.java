package chandana.javaAssignment2.interfaces;

public class Circle implements Shape {
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}

	@Override
	public int area() {		
		return (int) (radius * radius * Math.PI) ;
	}
	
	public int circumference(){
		return (int) (2*Math.PI * radius);
	}
	
	public int getRadius(){
		return radius;
	}
}
