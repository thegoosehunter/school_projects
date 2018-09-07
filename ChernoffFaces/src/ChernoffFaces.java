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

/*Applet code
<applet code = "ChernoffFaces" width = "400" height = "300">
<param name = "Status Bar" value = "Chernoff Faces">
</applet code>
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
		
		//head
		g.drawOval (sX, sY, 200, 200);
		
		//1st Chernoff parameters
		//left eye
		g.drawOval (sX + 125, sY + 50, 25, 25);
		//Right eye
		g.drawOval (sX + 50, sY + 50, 25, 25);

		//Nose - 2rd parameter
		g.drawLine(sX + 100, sY + 75, sX + 100,  sY + 100);
		
		//Mouth - 3rd parameter
		g.drawOval(sX + 50, sY + 150, 30, 15);
		
		//eyebrow - 4th parameter
		g.drawLine(sX + 50, sY + 50, sX + 150,  sY + 50);
		
	}

}
