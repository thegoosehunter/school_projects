package edu.gcu.Simmons.Leslie.rpn;
/**
 * ForthStack for Reverse Polish (HP) Style Calculator
<p>
 * @author      Les Simmons
 * @version     1.0.6
 * @since       2018-7-10
<p>
 * Forthstack use in Reverse Polish Notation Calculator.
*/
public class ForthStack extends ArrayStack implements Forth {
	
	public ForthStack(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	/**
     * ForthStack extends Arraystack and implements Forth
    <p>
     * @author      Les Simmons
     * @version     1.0.3
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since      2018-7-10
    <p>
     * Longer description.
     * Contains concrete methods:
     * add
     * sub
     * div
     * mult
     * dup
     * twoDup
     * square
     * root
     * factor
     * neg
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
	
	@Override
	public void square() {
		try {
			double value = super.pop();
			double c = value * value;
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
		
	}
	
	@Override
	public void factor() {
		try {
			double value = super.pop();
			double value1 = super.peek(9);
			double c = Math.pow(value, value1);
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}
	
	@Override
	public void root() {
		try {
			double value = super.pop();
			double c = value / value;
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}
	@Override
	public void posNeg() {
		try {
			double value = super.pop();
				if(value > 0) {
					value = value *-1;
				}
				else {
					value = value * 1;
				}
			
			double c = value;
			super.push(c);
			}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The array is either full or empty");
		}
	}
	
}
