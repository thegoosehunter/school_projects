/**
 * Triangle Problem
<p>
 * @author      Les Simmons
 * @version     1.0
 * @since       2018-27-08
<p>
 * Longer description.
 * Program to test what type of a triangle intergers would create:
 *  Equilateral, Isosceles, or Scalene  or if it is not a triangle 
 * pulls data from input.txt
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Triangle {

	  /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-27-08
    <p>
     * Longer description.
     * The program loops to read each line of input and processes it in turn. 
     * Use exception handling to trap input errors, and report them as "Not a Triangle"
    */
	
	public static void main(String[] args) {

		try {
		String file = "c:\\bit210\\Triangle\\input.txt";
		
		
		Scanner sc = new Scanner (new File(file));
		sc.useDelimiter(" ");
		
		while (sc.hasNext() ) {
		
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		
		if ((s1 > s2 + s3) || (s2 > s1 + s3) || (s3 > s1 + s2)) {
			System.out.println("This is not a triangle because one side cannot be larger than the sum of the other sides.");
			
		}
		
		else if ((s1==0) || (s2==0) || (s3==0)) {
			System.out.println("This is not a triangle because one side cannot be equal to zero.");
		}
		
		else if ((s1==s2) && (s1==s3) && (s2==s3)) {
			System.out.println("The triangle is Equalateral.");
		}
		
		else if ((s1==s2) || (s2==s3) || (s1==s3)) {
			System.out.println("The triangle is Isosceles.");
		}
		
		else if ((s1==s2) && (s2==s3) && (s1==s3)) {
			System.out.println("The triangle is Scalene.");
		
		}	
		
		else {
			System.out.println("Something went wrong.");
			
		}
		
	
		}
		
		}
		
		catch (FileNotFoundException fnfe)
		{
			
		 System.out.println("Unable to find input.txt, the application is exiting.");
		 
		}
		
		catch (InputMismatchException imme)
		{
			System.out.println("This is not a triangle because one of the variables is not an interger.");
			
		}
		
		
	}

}
	
