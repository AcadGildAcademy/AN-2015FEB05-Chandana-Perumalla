package chandana.assignment1.recursion;

public class Challenge1 {
	
	public static void main(String[] args) {
	String i =  "ACADGILD";	
     reverseString(i);

	}

	private static void reverseString(String i) {
			if(i.length()>1)
	    	reverseString(i.substring(1));
			System.out.print(i.charAt(0));
	}

}
