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
import java.io.*;
import java.util.*;

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
		
		int s1;
		int s2;
		int s3;
		

		// TODO Get data from file
		
		// TODO Test isTriangle
		
		if ((s1==s2) && (s1==s3) && (s2==s3))
			System.out.println("The Triangle is Equalateral.");
		
		else if ((s1==s2) || (s2==s3) || (s1==s3))
			System.out.println("The Trianle is Isosceles.");
		
		else ((s1!=s2) && (s2!=s3) && (s1!=s3))
			System.out.println("The Triangle is Scalene.");
		
		
	}

}
