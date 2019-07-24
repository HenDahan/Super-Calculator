package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Base_Calculator_Frame {

	private JFrame frame;
	private JTextField textField;

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
		
		JLabel lblSelectTheBase = new JLabel("Select the Base of the Number");
		lblSelectTheBase.setBounds(12, 10, 280, 15);
		frame.getContentPane().add(lblSelectTheBase);
		
		JLabel label = new JLabel("Select the Base to Convert");
		label.setBounds(12, 70, 280, 15);
		frame.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(290, 10, 60, 24);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(290, 70, 60, 24);
		frame.getContentPane().add(comboBox_1);
		
		JLabel label_1 = new JLabel("Enter the Number");
		label_1.setBounds(12, 130, 150, 15);
		frame.getContentPane().add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(160, 130, 100, 25);
		frame.getContentPane().add(textPane);
		
		textField = new JTextField();
		textField.setBounds(290, 190, 100, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("The Converted Number is ");
		label_2.setBounds(12, 190, 280, 15);
		frame.getContentPane().add(label_2);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(290, 130, 120, 25);
		frame.getContentPane().add(btnCalculate);
	}
}
