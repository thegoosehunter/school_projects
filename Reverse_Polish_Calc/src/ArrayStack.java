/**
 * ArrayStack for Reverse Polish (HP) Style Calculator
<p>
 * @author      Les Simmons
 * @version     1.0.4
 * @since       2018-16-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public class ArrayStack {
	 /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0.4
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-16-09
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	
	private static final int STACK_SIZE = 100;
	private double calc [];
	private int top;
	
	//ArrayStack constructor
	public ArrayStack() {
		calc = new double[STACK_SIZE];
		top = -1;	
	}
	
	//Push Method
	public void push(double c) {
		if (top < STACK_SIZE)
		{
			calc[++top] = c;
		}
		else {
			System.out.println("Stack Overflow, stack is full");;
		}
	}
	
	//Pop Method
	public double pop() throws DataStructureException {
		if ( !isEmpty() )
			return calc[top--];
		else
			throw new DataStructureException
				("Stack empty: cannot pop");
	}
	
	//isEmpty Method
	public boolean isEmpty() {
		if (top == -1) {
		return true;
		}
		else {
			return false;
		}
	}
	
	
	//Peek Method
	public double peek() throws DataStructureException {
		if ( !isEmpty( ) ) {
			return calc[top];
		}
		else {
			throw new DataStructureException
				("Stack empty: cannot peak");
		}
	}
	
	//Count Method
	public int count(int al) {
		if ( !isEmpty() ) {
			al = calc.length;
			return al;
		}
		else {
			System.out.println("Cannot count, the array is empty");
		}
	}
}
