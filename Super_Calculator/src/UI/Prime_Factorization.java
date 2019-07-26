package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import Utility.PrimeFactorization;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prime_Factorization {
	
	private JFrame frame;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void Prime_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prime_Factorization window = new Prime_Factorization();
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
	public Prime_Factorization() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 206);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Prime Factorization Calculator");

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number to Prime Factor:");
		lblEnterANumber.setBounds(10, 20, 230, 30);
		panel.add(lblEnterANumber);
		
		textInput = new JTextField();
		textInput.setBounds(260, 20, 120, 30);
		panel.add(textInput);
		textInput.setColumns(10);
		
		JTextPane textOutput = new JTextPane();
		textOutput.setBounds(160, 130, 270, 30);
		panel.add(textOutput);
		
		JLabel label = new JLabel("The Factorization is:");
		label.setBounds(10, 130, 150, 30);
		panel.add(label);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(textInput.getText());
				int[] list = PrimeFactorization.findPrimeFactor(num);
				StringBuffer output = new StringBuffer();
				for (int i=0;i < list.length;i++) {
					if (list[i] != 0) {
						output.append(list[i]+", ");
					}
					
				}
				output.deleteCharAt(output.length()-2);
				textOutput.setText(output.toString());
				
			}
		});
		btnCalculate.setBounds(260, 70, 120, 25);
		panel.add(btnCalculate);
	}
}
