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
		
		final int WINS = 68, LOSSES = 73, GAMESBACK = 10, ELIMNUMBER = 13;
		
		//head
		g.drawOval (sX, sY, 200, 200);
		
		//Write descriptions of each parameter in the face
		g.drawString("The height of the eyes represents the number of games won," + " " + WINS, sX, 50);
		g.drawString("The length of the eyebrows represents the number of games lost," + " " + LOSSES, sX,70);
		g.drawString("The length of the nose respresents the number of games back," + " " + GAMESBACK, sX, 90);
		g.drawString("The height of the mouth represents the elmination number," + " " + ELIMNUMBER, sX, 110);
		
		
		//1st Chernoff parameters
		//left eye
		g.drawOval (sX + 125, sY + 50, 25, WINS);
		//Right eye
		g.drawOval (sX + 50, sY + 50, 25, WINS);

		//Nose - 2rd parameter
		g.drawLine(sX + 100, sY + 75, sX + 100,  sY + 75 + GAMESBACK);
		
		//Mouth - 3rd parameter
		g.drawOval(sX + 50, sY + 150, 100, ELIMNUMBER);
		
		//left eyebrow - 4th parameter
		g.drawLine(sX + 50, sY + 50, sX + 50 + LOSSES,  sY + 50);
		
		//right eyebrow - 4th parameter
		g.drawLine(sX + 125, sY + 50, sX + 125 + LOSSES,  sY + 50);
		
	}

}
