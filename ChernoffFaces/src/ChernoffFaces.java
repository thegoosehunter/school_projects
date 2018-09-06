/**
 * Short one line description of the class
<p>
 * @author      Les Simmons
 * @version     1.0
 * @since       2018-22-08
<p>
 * Longer description.
 * Describe what the class does and how it works.
*/
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class ChernoffFaces extends JApplet {

	  /**
     * Short one line description of the method
    <p>
     * @author      Les Simmons
     * @version     1.0
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-22-08
    <p>
     * Longer description.
     * Describe what the method does and how it works.
    */
	
	public void paint (Graphics g) {
		
		super.paint(g);
		
		//TODO set Applet size and offsets
		
		//head - draws a circle (static - not used a parameter of the Chernoff Face)
		g.drawOval (200, 200, 200, 200);
		
		//TODO Left eye - 1st parameter
		
		//TODO Right eye - 2nd parameter
		
		//TODO Nose - 3rd parameter
		
		//TODO Mouth - 4th parameter
	}

}
