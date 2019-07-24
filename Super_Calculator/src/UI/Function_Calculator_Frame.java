package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Function_Calculator_Frame {

	private JFrame frame;
	private JTextField textAnswer;

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
		frame.setBounds(100, 100, 600, 296);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnSquare = new JButton("aX^2+bX+c=0");
		btnSquare.setBounds(233, 15, 135, 40);
		panel.add(btnSquare);
		
		JButton btnCube = new JButton("aX^3+bX^2+cX+d=0");
		btnCube.setBounds(390, 15, 180, 40);
		panel.add(btnCube);
		
		JLabel lblSelectFunctionType = new JLabel("Select Function Type:");
		lblSelectFunctionType.setBounds(24, 0, 186, 63);
		panel.add(lblSelectFunctionType);
		
		JTextPane aText = new JTextPane();
		aText.setBounds(30, 80, 40, 20);
		panel.add(aText);
		
		JTextPane bText = new JTextPane();
		bText.setBounds(130, 80, 40, 20);
		panel.add(bText);
		
		JTextPane cText = new JTextPane();
		cText.setBounds(230, 80, 40, 20);
		panel.add(cText);
		
		JTextPane dText = new JTextPane();
		dText.setBounds(330, 80, 40, 20);
		panel.add(dText);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(10, 80, 20, 15);
		panel.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setBounds(110, 80, 20, 15);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(210, 80, 20, 15);
		panel.add(lblC);
		
		JLabel lblD = new JLabel("d");
		lblD.setBounds(310, 80, 20, 15);
		panel.add(lblD);
		
		JButton btnCalculateRoots = new JButton("Calculate Roots");
		btnCalculateRoots.setBounds(400, 80, 150, 25);
		panel.add(btnCalculateRoots);
		
		textAnswer = new JTextField();
		textAnswer.setBounds(20, 125, 550, 35);
		panel.add(textAnswer);
		textAnswer.setColumns(10);
	}
}
