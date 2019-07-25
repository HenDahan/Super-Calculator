package UI;
import Utility.Fibonacci;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibonacci_Series_Frame {

	private JFrame frame;
	private JTextField textInput;
	Fibonacci fib;

	/**
	 * Launch the application.
	 */
	public static void Fib_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci_Series_Frame window = new Fibonacci_Series_Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fibonacci_Series_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 260);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnetr = new JLabel("Insert the organ you want to find from the Fibonacci sequence:");
		lblEnetr.setBounds(12, 25, 488, 37);
		panel.add(lblEnetr);
		
		textInput = new JTextField();
		textInput.setBounds(470, 25, 120, 40);
		panel.add(textInput);
		textInput.setColumns(10);
		
		JTextPane textOutput = new JTextPane();
		textOutput.setBounds(470, 150, 120, 30);
		panel.add(textOutput);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(textInput.getText().toString());
				fib = new Fibonacci();
				int output = fib.fibonacci_Sequence(num);
				textOutput.setText(""+output);
			}
		});
		btnCalculate.setBounds(470, 80, 120, 40);
		panel.add(btnCalculate);
		
		JLabel labelOutput = new JLabel("The Value of the given number in Fibonacci sequence is:");
		labelOutput.setBounds(12, 150, 400, 35);
		panel.add(labelOutput);
	}

}
