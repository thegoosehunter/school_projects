import java.util.Stack;
/**
 * ArrayStack for Reverse Polish (HP) Style arrulator
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
	
	private int STACK_SIZE = 100;
	private double [] arr;
	private int top;
	
	//ArrayStack constructor
	public ArrayStack(double[]){
		arr = new double[STACK_SIZE];
		top = -1;	
	}
	
	//Push Method
	public void push(double c) {
		if (top < STACK_SIZE)
		{
			arr[++top] = c;
		}
		else {
			System.out.println("Stack Overflow, stack is full");;
		}
	}
	
	//Pop Method
	public double pop(){
		if ( !isEmpty() )
			return arr[top--];
		else {
			System.out.println("Stack empty: cannot pop");
		}
			
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
	public double peek(){
		if ( !isEmpty( ) ) {
			return arr[top];
		}
		else {
			System.out.println("Stack empty: cannot peak");
		}
	}
	
	//Count Method
	public int count(int al) {
		if ( !isEmpty() ) {
			al = arr.length;
			return al;
		}
		else {
			System.out.println("Cannot count, the array is empty");
		}
	}
}
