package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Prime_Factorization {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void Prime_Frame() {
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		lblEnterANumber.setBounds(48, 29, 116, 47);
		panel.add(lblEnterANumber);
		
		textField = new JTextField();
		textField.setBounds(166, 36, 177, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 85, 416, 59);
		panel.add(textPane);
	}
}
