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
		
		//center of 400w x 300h screen
		int sX = 200, sY = 150;
		
		//head - draws a circle (static - not used a parameter of the Chernoff Face)
		g.drawOval (sX, sY, 200, 200);
		
		//1st Chernoff parameters
		//left eye
		g.drawOval (sX , sY, 95, 25);
		//Right eye
		g.drawOval (sX, 2, 35, 25);
		
		//2nd Chernoff parameters
		//Left Eyebrow
		g.drawLine(10, 10, 10, 10);
		//Right Eyebrow
		g.drawLine(10, 10, 10, 10);
		
		//Nose - 3rd parameter
		g.drawLine(30, 0, 0, 30);
		
		//Mouth - 4th parameter
		g.drawOval(sX, 15, sY, 15);
	}

}
