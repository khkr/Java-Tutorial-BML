//Every function or class in java has tons of methods
//There is no way to memorize 
// PAGE 130 in the textbook

import java.util.Scanner;

public class LessonString
{
	public static void main(String[] args) {
		
		String newString = new String();

		Scanner scan = new Scanner(System.in);

		// System.out.println("Enter a String");

		// //Input for the string
		// newString = scan.nextLine();

		// //Basic tutorial: Output of the String
		// System.out.println("The String is: "+newString);

		String a = "Hi"; 
		String b = "What is your name";

		//Combine Strings a and b and store it in a String called combinedString

		String combinedString = new String();

		combinedString = a+" "+b;

		System.out.println(combinedString);

		//Length of the combinedString
		System.out.println("Length of the String is: "+combinedString.length());

		//Character at index
		System.out.println(combinedString.charAt(6));

		//combinedString = combinedString.toUpperCase();

		System.out.println("Upper case version: "+combinedString.toUpperCase());

		//Lower case example

		System.out.println("Python Is The Best".toLowerCase());


		//OTHER FORM OF CONCATENATION using METHODS

		combinedString = a.concat(b);

		System.out.println("V2.0: "+combinedString);

		//Compare two strings

		String s1 = "This";
		String s2 = "this";

		if(s1.equalsIgnoreCase(s2))
		{
		System.out.println("Yeah they are equal");	
		}
		else
		{
			System.out.println("They are not equal");
		}


	}
}