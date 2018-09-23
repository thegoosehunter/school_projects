import java.util.Stack;
/**
 * Test Client
<p>
 * @author      Les Simmons
 * @version     1.0.2
 * @since       2018-22-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public class TestForth {
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
		
		ArrayStack myStack = new ArrayStack();
		ForthStack myForthStack = new ForthStack();
		
		//test push and peek
		myStack.push(1.2);
		System.out.println(myStack.peek(0));
		myStack.push(2.3);
		System.out.println(myStack.peek(1));
		myStack.push(3.4);
		System.out.println(myStack.peek(2));
		
		//test pop
		System.out.println(myStack.pop());
		
		//test count
		System.out.println(myStack.count());
		
		//test add
		myForthStack.add();
		System.out.println(myStack.peek(2));
		
		//test sub
		myForthStack.sub();
		System.out.println(myStack.peek(2));
		
		//test mult
		myForthStack.mult();
		System.out.println(myStack.peek(2));
		
		//test div
		myForthStack.div();
		System.out.println(myStack.peek(2));
		
		//test dup
		myForthStack.dup();
		System.out.println(myStack.peek(2));
		
		//test twoDup
		myForthStack.twoDup();
		System.out.println(myStack.peek(2));
		
		//test clear
		myStack.clear();
		
		//test peek after clear
		System.out.println(myStack.peek(0));
		System.out.println(myStack.peek(1));
		System.out.println(myStack.peek(2));

		//success
		System.out.print("SUCCESS!");
		
	}

}

