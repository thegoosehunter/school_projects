import javax.swing.*;
import java.awt.*;


public class RPN extends JFrame {
	
	//container
	private Container contents;
	private JTextField input, output;
	private JLabel inLabel, outLabel;
	
	//constructor
	public RPN(){
		
		//title bar
		super("Reverse Polish Notation Calculator");
		
		//get container
		contents = getContentPane();
		contents.setLayout(new FlowLayout());
		
		inLabel = new JLabel("Input");
		input = new JTextField(5);
		outLabel = new JLabel("Output");
		output = new JTextField(5);
		
		//add components to window
		contents.add(inLabel);
		contents.add( input );
		contents.add(outLabel);
		contents.add( output );
		
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
