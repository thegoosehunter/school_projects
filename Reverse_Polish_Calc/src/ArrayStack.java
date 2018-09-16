/**
 * ArrayStack for Reverse Polish (HP) Style Calculator
<p>
 * @author      Les Simmons
 * @version     1.0
 * @since       2018-15-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public class ArrayStack {
	 /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-15-09
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	
	private static final int STACK_SIZE = 100;
	private double Calc [ ] stack;
	private int top;
	
	//ArrayStack constructor
	public ArrayStack () {
		
		stack = new double Calc [ STACK_SIZE ];
		top = -1;
		
	}
	
	//Push Method
	public boolean push ( Calc c) {
		
		if ( !isFull ( ) )
		{
			stack [ ++top ];
			return true;
		}
		else
			return false;
	}
	
	//Pop Method
	public double Calc pop () throws DataStructureException {
		
		if ( !isEmpty () )
			return stack [ top-- ];
		else
			throw new DataStructureException
				("Stack empty: cannot pop");
	}
	
	//isEmpty Method
	public boolean isEmpty () {
		return ( top == -1 );
	}
	
	//isFull Method
	public boolean isFull () {
		return ( top == ( STACK_SIZE - 1) );
	}
	
	//Peek Method
	public double Calc peek () throw DataStructureException {
		
		if ( !isEmpty ( ) )
			return stack [ top ];
		else
			throw new DataStructureException
				("Stack empty: cannot peak");
	}
	
	//Count Method
	public int count () {
		
	}
}
