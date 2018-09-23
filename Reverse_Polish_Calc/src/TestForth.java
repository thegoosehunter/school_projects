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
		
		//test push
		myStack.push(1.2);
		myStack.push(2.3);
		myStack.push(3.4);
		myStack.push(4.5);
		myStack.push(5.6);
		
		//test peek
		System.out.println(myStack.peek(1));
		System.out.println(myStack.peek(2));

		//test pop
		System.out.println(myStack.pop());
		
		//test count
		System.out.println(myStack.count());
		
		//test add
		System.out.println(myStack.peek(2));
		
		//test sub
		System.out.println("sub test");
		
		//test mult
		System.out.println("mult test");
		
		//test div
		System.out.println("div test");
		
		//test dup
		System.out.println("dup test");
		
		//test twoDup
		System.out.println("twoDup test");
		
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

