
 /**
 * ForthStack for Reverse Polish (HP) Style Calculator
<p>
 * @author      Les Simmons
 * @version     1.0.3
 * @since       2018-22-09
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
public class ForthStack extends ArrayStack implements Forth {
	
	private int stackSize;
	private double[] arr;
	private int top;
	
	 public ForthStack(int n) {
		super(n);
		arr = new double[stackSize];
		top = -1;
		// TODO Auto-generated constructor stub
	}

	/**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0.3
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-22-09
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	
	@Override
	public void add() {
		try {
			double value1 = super.pop();
			double value2 = super.pop();
			double c = value1 + value2;
			super.push(c);
			System.out.println(c);
			}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

	@Override
	public void sub() {
		try {
			double value1 = super.pop();
			double value2 = super.pop();
			double c = value1 - value2;
			super.push(c);
			}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

	@Override
	public void mult() {
		try {
			double value1 = super.pop();
			double value2 = super.pop();
			double c = value1 * value2;
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

	@Override
	public void div() {
		try {
			double value1 = super.pop();
			double value2 = super.pop();
			double c = value1 / value2;
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

	@Override
	public void dup() {
		try {
			double c = super.peek(2);
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

	@Override
	public void twoDup() {
		try {
			double value1 = super.peek(1);
			double value2 = super.peek(2);
			super.push(value1);
			super.push(value2);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}

}
