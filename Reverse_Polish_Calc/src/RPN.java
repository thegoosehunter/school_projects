import javax.swing.JFrame;
import java.awt.Container;

public class RPN extends JFrame {
	
	//container
	private Container contents;
	
	//constructor
	public RPN(){
		
		//title bar
		super("Reverse Polish Notation Calculator");
		
		//get container
		contents = getContentPane();
		
		//window size
		setSize(400,300);
		
		//make visible
		setVisible(true);
	}

	public static void main(String[] args) {
		RPN rpnGui = new RPN();
		rpnGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
