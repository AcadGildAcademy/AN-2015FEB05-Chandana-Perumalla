package chandana.javaAssignment2.inheritance;


	public class TriangleArea extends RectangleArea{
		
		public TriangleArea(int base, int height){
			super(base,height);
		}
		
		public int getArea(){
			return (super.area())/2;
		}
	}


