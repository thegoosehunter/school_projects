
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
		double value1 = super.pop();
		double value2 = super.pop();
		double c = value1 + value2;
		super.push(c);
	}

	@Override
	public void sub() {
		double value1 = super.pop();
		double value2 = super.pop();
		double c = value1 - value2;
		super.push(c);
	}

	@Override
	public void mult() {
		double value1 = super.pop();
		double value2 = super.pop();
		double c = value1 * value2;
		super.push(c);
	}

	@Override
	public void div() {
		double value1 = super.pop();
		double value2 = super.pop();
		double c = value1 / value2;
		super.push(c);
	}

	@Override
	public void dup() {
		double c = super.peek(2);
		super.push(c);
	}

	@Override
	public void twoDup() {
		double value1 = super.peek(1);
		double value2 = super.peek(2);
		super.push(value1);
		super.push(value2);
	}

}
