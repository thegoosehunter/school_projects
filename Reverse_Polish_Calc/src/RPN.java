import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPN extends JFrame {
	
	//container
	private Container contents;
	private JTextField input, output, error;
	private JLabel inLabel, outLabel, errorLabel;
	private JButton pushBut, popBut,addBut, subBut, multiBut, divBut, dupBut, twoDupBut, clearBut;
	
	//constructor
	public RPN(){
				
		//title bar
		super("RPN Calculator");
		
		//get container
		contents = getContentPane();
		contents.setLayout(new FlowLayout());
		
		//labels, textfields, buttons
		inLabel = new JLabel("Input:");
		input = new JTextField(5);
		outLabel = new JLabel("Output:");
		output = new JTextField(5);
		errorLabel = new JLabel("Error:");
		error = new JTextField(5);
		pushBut = new JButton("push");
		popBut = new JButton("pop");
		addBut = new JButton("+");
		subBut = new JButton("-");
		multiBut = new JButton("*");
		divBut = new JButton("/");
		dupBut = new JButton("dup");
		twoDupBut = new JButton("2Dup");
		clearBut = new JButton("clr");
		
		
		//add components to window
		contents.add(inLabel);
		contents.add( input );
		contents.add(outLabel);
		contents.add( output );
		contents.add(errorLabel);
		contents.add( error );
		contents.add( pushBut );
		contents.add( popBut );
		contents.add( addBut );
		contents.add( subBut );
		contents.add( multiBut );
		contents.add( divBut );
		contents.add( dupBut );
		contents.add( twoDupBut );
		contents.add( clearBut );
		
		//Textfield Handler
		final class TextFieldHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
			}
			
		}
		
		//Button Handler
		final class ButtonHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub	
			}
		
		}
		
		//handlers
		TextFieldHandler tfh = new TextFieldHandler();
		ButtonHandler bh = new ButtonHandler();
		
		//event handler and listener for textfields
		input.addActionListener(tfh);
		output.addActionListener(tfh);
		error.addActionListener(tfh);
		
		//event handler and listener for buttons
		addBut.addActionListener(bh);
		subBut.addActionListener(bh);
		multiBut.addActionListener(bh);
		divBut.addActionListener(bh);
		dupBut.addActionListener(bh);
		twoDupBut.addActionListener(bh);
		clearBut.addActionListener(bh);
		

		//window size
		setSize(350,150);
		
		//make visible
		setVisible(true);
	}

	public static void main(String[] args) {
		RPN rpnGui = new RPN();
		rpnGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
