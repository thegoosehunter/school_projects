import java.util.Stack;

/**
 * ArrayStack for Reverse Polish (HP) Style arrulator
<p>
 * @author      Les Simmons
 * @version     1.0.5
 * @since       2018-21-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public class ArrayStack extends AbstractStack {
	 /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0.5
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-21-09
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	
<<<<<<< HEAD
	private int STACK_SIZE = 100;
=======
	private int stackSize;
>>>>>>> branch 'master' of https://github.com/thegoosehunter/school_projects.git
	private double [] arr;
	private int top;
	
	//ArrayStack constructor
	public ArrayStack(int n){
		stackSize = n;
		arr = new double[stackSize];
		top = -1;	
	}
	
	//Push Method
	public void push(double c) {
		try {
			if (top < stackSize)
			{
			arr[++top] = c;
			}
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Stack overflow, the array is full");
		}
	}
	
	//Pop Method
	public double pop(){
		try {
		if (!isEmpty()) {
			double temp = arr[top -1];
			System.out.println( "removed "+temp);
			top--;
		}
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Stack is empty, cannot pop");
		}
		return arr[top - 1];
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
	public double peek(int n){
		if ( !isEmpty( ) ) {
		double value = arr[n];
			return value;
		}
		else {
			System.out.println("Stack empty: cannot peak");
		}
		return n;
	}
	
	//Count Method
	public int count() {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter = i;
		}
<<<<<<< HEAD
		else {
			System.out.println("Cannot count, the array is empty");
		}
		
		//clear method from AbstractStack
		public AbstractStack.clear();
		
		//push method from AbstractStack
		public AbstractStack.peek();
		
=======
	return counter;
>>>>>>> branch 'master' of https://github.com/thegoosehunter/school_projects.git
	}
}
