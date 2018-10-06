import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RPN extends JFrame {
	
	//container
	private Container contents;
	private JTextField input, error, stack1, stack2, stack3, stack4, stack5,stack6, stack7, stack8, stack9, stack10;
	private JLabel inLabel, errorLabel, stack1Label, stack2Label, stack3Label, stack4Label, stack5Label, stack6Label, stack7Label, stack8Label, stack9Label, stack10Label ;
	private JButton pushBut, popBut, addBut, subBut, multiBut, divBut, dupBut, twoDupBut, clearBut;
	private JTextArea message;
	double c;
	
	//constructor
	public RPN(){
				
		//title bar
		super("RPN Calculator");
		
		//get container
		contents = getContentPane();
		contents.setLayout(new FlowLayout());
		
		
		//labels, textfields, buttons
		input = new JTextField(5);
		inLabel = new JLabel("Input:");
		error = new JTextField(5);
		errorLabel = new JLabel("Error:");
		stack1 = new JTextField(5);
		stack1Label = new JLabel("Stack 1:");
		stack2 = new JTextField(5);
		stack2Label = new JLabel("Stack 2:");
		stack3 = new JTextField(5);
		stack3Label = new JLabel("Stack 3:");
		stack4 = new JTextField(5);
		stack4Label = new JLabel("Stack 4:");
		stack5 = new JTextField(5);
		stack5Label = new JLabel("Stack 5:");
		stack6 = new JTextField(5);
		stack6Label = new JLabel("Stack 6:");
		stack7 = new JTextField(5);
		stack7Label = new JLabel("Stack 7:");
		stack8 = new JTextField(5);
		stack8Label = new JLabel("Stack 8:");
		stack9= new JTextField(5);
		stack9Label = new JLabel("Stack 9:");
		stack10 = new JTextField(5);
		stack10Label = new JLabel("Stack 10:");
		
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
		//labels and text fields
		contents.add(inLabel);
		contents.add( input );
		contents.add(errorLabel);
		contents.add( error );
		contents.add(stack1Label);
		contents.add( stack1 );
		contents.add(stack2Label);
		contents.add( stack2 );
		contents.add(stack3Label);
		contents.add( stack3 );
		contents.add(stack4Label);
		contents.add( stack4 );
		contents.add(stack5Label);
		contents.add( stack5 );
		contents.add(stack6Label);
		contents.add( stack6 );
		contents.add(stack7Label);
		contents.add( stack7 );
		contents.add(stack8Label);
		contents.add( stack8 );
		contents.add(stack9Label);
		contents.add( stack9 );
		contents.add(stack10Label);
		contents.add( stack10 );

		//buttons
		contents.add( pushBut );
		contents.add( popBut );
		contents.add( addBut );
		contents.add( subBut );
		contents.add( multiBut );
		contents.add( divBut );
		contents.add( dupBut );
		contents.add( twoDupBut );
		contents.add( clearBut );
		//notes

		//stack
		ForthStack calcStack = new ForthStack(10);

		//Textfield Handler
		final class TextFieldHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try{
					if(((JTextField) input) != null) {
				String temp = input.getText();
				c = Double.parseDouble(temp);
					}
					if (calcStack.isEmpty() == false){
						double num = calcStack.peek(4);
						String temp = Double.toString(num);
						output.setText(temp);
					}
				}
				finally{

				}
			}
			
		}
		
		//Button Handler
		final class ButtonHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					if (ae.getSource() == pushBut) {
						calcStack.push(c);
					}
					else if(ae.getSource() == popBut){
						calcStack.pop();
					}
					else if(ae.getSource() == addBut){
						calcStack.add();
					}
					else if(ae.getSource() == subBut){
						calcStack.sub();
					}
					else if(ae.getSource() == multiBut){
						calcStack.mult();
					}
					else if(ae.getSource() == divBut){
						calcStack.div();
					}
					else if(ae.getSource() == dupBut){
						calcStack.dup();
					}
					else if(ae.getSource() == twoDupBut){
						calcStack.twoDup();
					}
					else if(ae.getSource() == clearBut){
						calcStack.clear();
					}
					else {
						System.out.println("Somthing went wrong");
					}
				}
				finally {
					
				}
			}
		
		}
		
		//handlers
		TextFieldHandler tfh = new TextFieldHandler();
		ButtonHandler bh = new ButtonHandler();
		
		//event handler and listener for textfields
		input.addActionListener(tfh);
		stack1.addActionListener(tfh);
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
		setSize(350,250);
		
		//make visible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		RPN rpnGui = new RPN();
		rpnGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
