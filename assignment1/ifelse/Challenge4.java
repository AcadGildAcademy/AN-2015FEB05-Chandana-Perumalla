package chandana.assignment1.ifelse;

import java.util.Scanner;

public class Challenge4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String type, letter;
		System.out.println("Enter a character");
		letter = input.next();
		if(letter.equalsIgnoreCase("a")|| letter.equalsIgnoreCase("e")||letter.equalsIgnoreCase("i")||letter.equalsIgnoreCase("o")||letter.equalsIgnoreCase("u")){
		type = "vowel";
		}
		else
		type = "constant";
		System.out.println(letter+" is "+ type);
		input.close();

	}

}
