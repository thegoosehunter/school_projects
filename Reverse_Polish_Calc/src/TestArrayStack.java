package Reverse_Polish_Calc;
import java.util.Stack;
/**
 * Test Client for ArrayStack
<p>
 * @author      Les Simmons
 * @version     1.0.2
 * @since       2018-16-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/

public class TestArrayStack {
	 /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0.2
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-16-09
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	public static void main(String[] args) {
		
		Stack ArrayStack = new ArrayStack();
		
		//test push
		ArrayStack.push(1.2);
		System.out.println(ArrayStack.peek());
		ArrayStack.push(2);
		System.out.println(ArrayStack.peek());
		ArrayStack.push(3);
		System.out.println(ArrayStack.peek());
		ArrayStack.push(4);
		System.out.println(ArrayStack.peek());
		ArrayStack.push(5);
		System.out.println(ArrayStack.peek());
		
		//
		

	}

}
