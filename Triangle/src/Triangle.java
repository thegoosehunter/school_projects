/**
 * Triangle Problem
<p>
 * @author      Les Simmons
 * @version     1.0.4
 * @since       2018-02-09
<p>
 * Longer description.
 * Program to test what type of a triangle intergers from a file would create:
 *  Equilateral, Isosceles, or Scalene  or if it is not a triangle 
 * pulls data from input.txt
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Triangle {

	  /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0.4
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-02-09
    <p>
     * Longer description.
     * The program loops to read each line of input and processes it in turn. 
     * Use exception handling to trap input errors, and report them as "Not a Triangle because"
     * This code is really long for what it does, I would like to reduce it greatly,
     * but for problem solving purposes it works!
    */
	
	public static void main(String[] args) {

		//file and data processing
		try {
		String file = "c:\\bit210\\Triangle\\input.txt";
		
		
		Scanner sc = new Scanner (new File(file));
		
		while (sc.hasNext() ) {
			
			String stringRead = sc.nextLine();
			
			Scanner parse = new Scanner (stringRead);
			parse.useDelimiter(" ");
			
		
			int s1 = parse.nextInt();
			int s2 = parse.nextInt();
			int s3 = parse.nextInt();
		
			//begin triangle tests
			if ((s1<=0) || (s2<=0) || (s3<=0)) {
				System.out.println("This is not a triangle because one side cannot be equal to zero or less than zero.");
			}
			
			else if ((s1 > s2 + s3) || (s2 > s1 + s3) || (s3 > s1 + s2)) {
				System.out.println("This is not a triangle because one side cannot be larger than the sum of the other sides.");
			
			}
		
		
			else if ((s1==s2) && (s1==s3) && (s2==s3)) {
				System.out.println("The triangle is Equalateral.");
			}
		
			else if ((s1==s2) || (s2==s3) || (s1==s3)) {
				System.out.println("The triangle is Isosceles.");
			}
		
			else if ((s1!=s2) && (s2!=s3) && (s1!=s3)) {
				System.out.println("The triangle is Scalene.");
		
			}	
		
			else {
				System.out.println("Something went wrong.");
			
			}
		
		
			}
		
		}
		
		//begin error handling
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
	
