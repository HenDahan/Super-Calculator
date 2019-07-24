package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Function_Calculator_Frame {

	private JFrame frame;
	private JTextField textField;
	private JTextField aPrint;
	private JTextField bPrint;
	private JTextField cPrint;
	private JTextField dPrint;

	/**
	 * Launch the application.
	 */
	public void Function_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Function_Calculator_Frame window = new Function_Calculator_Frame();
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
	public Function_Calculator_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAxbxc = new JButton("aX^2+bX+c=0");
		btnAxbxc.setBounds(150, 5, 135, 40);
		panel.add(btnAxbxc);
		
		JButton btnAxbxcxd = new JButton("aX^3+bX^2+cX+d=0");
		btnAxbxcxd.setBounds(300, 5, 180, 40);
		panel.add(btnAxbxcxd);
		
		textField = new JTextField();
		textField.setBounds(5, 15, 137, 20);
		textField.setText("Select Function Type:");
		panel.add(textField);
		textField.setColumns(10);
		
		aPrint = new JTextField();
		aPrint.setBounds(12, 85, 29, 19);
		panel.add(aPrint);
		aPrint.setColumns(10);
		
		JTextPane aText = new JTextPane();
		aText.setBounds(53, 73, 6, 21);
		panel.add(aText);
		
		bPrint = new JTextField();
		bPrint.setColumns(10);
		bPrint.setBounds(94, 85, 29, 19);
		panel.add(bPrint);
		
		JTextPane bText = new JTextPane();
		bText.setBounds(135, 83, 6, 21);
		panel.add(bText);
		
		cPrint = new JTextField();
		cPrint.setColumns(10);
		cPrint.setBounds(167, 85, 29, 19);
		panel.add(cPrint);
		
		JTextPane cText = new JTextPane();
		cText.setBounds(218, 73, 6, 21);
		panel.add(cText);
		
		dPrint = new JTextField();
		dPrint.setColumns(10);
		dPrint.setBounds(250, 75, 29, 19);
		panel.add(dPrint);
		
		JTextPane dText = new JTextPane();
		dText.setBounds(304, 73, 6, 21);
		panel.add(dText);
	}
}
