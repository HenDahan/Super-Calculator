package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import Utility.BaseConvertor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Base_Calculator_Frame {

	private JFrame frame;
	private JTextField textOutput;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void Base_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base_Calculator_Frame window = new Base_Calculator_Frame();
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
	public Base_Calculator_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Base Calculator");

		
		JLabel lblSelectTheBase = new JLabel("Select the Base of the Number");
		lblSelectTheBase.setBounds(12, 10, 280, 15);
		frame.getContentPane().add(lblSelectTheBase);
		
		JLabel label = new JLabel("Select the Base to Convert");
		label.setBounds(12, 70, 280, 15);
		frame.getContentPane().add(label);
		
		JComboBox<String> firstBase = new JComboBox<String>();
		firstBase.setBounds(290, 10, 60, 24);
		firstBase.addItem("2");
		firstBase.addItem("8");
		firstBase.addItem("10");
		firstBase.addItem("16");
		frame.getContentPane().add(firstBase);
		
		JComboBox<String> secondBase = new JComboBox<String>();
		secondBase.setBounds(290, 70, 60, 24);
		secondBase.addItem("2");
		secondBase.addItem("8");
		secondBase.addItem("10");
		secondBase.addItem("16");
		frame.getContentPane().add(secondBase);
		
		JLabel label_1 = new JLabel("Enter the Number");
		label_1.setBounds(12, 130, 150, 15);
		frame.getContentPane().add(label_1);
		
		textOutput = new JTextField();
		textOutput.setBounds(200, 190, 200, 25);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
		
		JLabel label_2 = new JLabel("The Converted Number is ");
		label_2.setBounds(12, 190, 200, 15);
		frame.getContentPane().add(label_2);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int base1 = Integer.parseInt(firstBase.getSelectedItem().toString());
				int base2 = Integer.parseInt(secondBase.getSelectedItem().toString());
				String num = textInput.getText();
				boolean check;
				String answer;
				
				if (base1 == base2) {
					check = BaseConvertor.checkValidBase(num, base1);
					if (check == true)
						answer = num;
					else
						answer = "-1";
				}
				else {
					if (base1 == 2) {
						answer = BaseConvertor.convert2toN(num, base2);
					}
					else if(base1 == 8) {
						answer = BaseConvertor.convert8toN(num, base2);
					}
					else if(base1 == 10) {
						answer = BaseConvertor.convert10toN(num, base2);
					}
					else
						answer = BaseConvertor.convert16toN(num, base2);
					
				}
				if (answer != "-1") {
				textOutput.setText(answer);
				}
				else {
					textOutput.setText("Invalid Number for Base "+base1);
				}
							
			}
		});
		btnCalculate.setBounds(290, 130, 120, 25);
		frame.getContentPane().add(btnCalculate);
		
		textInput = new JTextField();
		textInput.setColumns(10);
		textInput.setBounds(150, 130, 100, 25);
		frame.getContentPane().add(textInput);
	}
}
