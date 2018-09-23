
public class ForthStack extends ArrayStack implements Forth {

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
		double c = super.peek(top);
		super.push(c);
	}

	@Override
	public void twoDup() {
		double value1 = super.peek(top - 1);
		double value2 = super.peek(top);
		super.push(value1);
		super.push(value2);
	}

}
