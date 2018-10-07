
/**
 * AbstractStack
<p>
 * @author      Les Simmons
 * @version     1.0.2
 * @since       2018-07-10
<p>
 * AbsractStack for methods used in Reverse Polish Notation Calculator
*/
public abstract class AbstractStack {
	/**
     * pure abstract class with methods
    <p>
     * @author      Les Simmons
     * @version     1.0.2
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-21-09
    <p>
     * abstract methods:.
     * push
     * peek
     * pop
     * clear
    */
	
	//push method
	public abstract void push(double c);
	
	//peek method
	public abstract double peek();
	
	//pop method
	public abstract double pop();
	
	//clear method
	public abstract void clear();

}
