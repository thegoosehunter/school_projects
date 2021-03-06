package edu.gcu.Simmons.Leslie.rpn;

/**
 * Forth interface file
<p>
 * @author      Les Simmons
 * @version     1.0.4
 * @since       2018-7-10
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public interface Forth {
	/**
     * interface with methods
    <p>
     * @author      Les Simmons
     * @version     1.0.4
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-7-10
    <p>
     * contains methods:
     * add
     * sub
     * div
     * dup
     * twoDup
     * square
     * factor
     * root
     * neg
    */
	
	//add method - pops two values from the stack, adds them together, returns result to the stack
	public void add();
	
	//sub method - pops two values from the stack, subtracts 2nd from the 1st, returns result to the stack
	public void sub();
	
	//mult method - pops two values from the stack, multiplys them, returns result to the stack
	public void mult();
	
	//div method -  pops two values from the stack, divides 2nd by the 1st, returns result to the stack
	public void div();
	
	//dup method - peeks at the top value in the stack, pushes a copy of that value onto the stack
	public void dup();
	
	//twoDup method - peeks at the top two values in the stack, pushes a copy of both values onto the stack
	public void twoDup();
	
	//square method - pops top value and squares it and returns it to the stack
	public void square();
	
	//factor method - pops the top value in the stack and then multiplies by the previous value
	public void factor();
	
	//root method - pops the top value divides by itself and returns it to the stack
	public void root();
	
	// posNef method - pops the top value and changes it to a negative number its postive or changes it to postivie if its negative and returns it to the stack
	public void posNeg();
}
