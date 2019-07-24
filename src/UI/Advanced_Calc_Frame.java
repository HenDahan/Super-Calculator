package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Advanced_Calc_Frame {

	private JFrame frame;
	private JTextField in_textField;

	/**
	 * Launch the application.
	 */
	public void Advanced_Frame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advanced_Calc_Frame window = new Advanced_Calc_Frame();
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
	public Advanced_Calc_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane out_textPane = new JTextPane();
		out_textPane.setBounds(10, 10, 630, 70);
		panel.add(out_textPane);
		

		JButton btn_0 = new JButton("0");
		btn_0.setBounds(10, 290, 45, 30);
		panel.add(btn_0);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(10, 250, 45, 30);
		panel.add(btn_1);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(10, 212, 45, 30);
		panel.add(btn_4);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(10, 170, 45, 30);
		panel.add(btn_7);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBounds(65, 250, 45, 30);
		panel.add(btn_2);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(65, 210, 45, 30);
		panel.add(btn_5);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBounds(65, 170, 45, 30);
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(120, 170, 45, 30);
		panel.add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(120, 210, 45, 30);
		panel.add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(120, 250, 45, 30);
		panel.add(btn_3);
		
		JButton dot_btn = new JButton(".");
		dot_btn.setBounds(65, 290, 45, 30);
		panel.add(dot_btn);
		
		JButton equal_btn = new JButton("=");
		equal_btn.setBounds(120, 290, 45, 30);
		panel.add(equal_btn);
		
		JButton del_btn = new JButton("DEL");
		del_btn.setBounds(470, 170, 80, 30);
		panel.add(del_btn);
		
		JButton AC_btn = new JButton("AC");
		AC_btn.setBounds(560, 170, 80, 30);
		panel.add(AC_btn);
		
		JButton btn_plus = new JButton("+");
		btn_plus.setBounds(470, 210, 45, 30);
		panel.add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setBounds(470, 250, 45, 30);
		panel.add(btn_minus);
		
		JButton btn_division = new JButton("/");
		btn_division.setBounds(530, 210, 45, 30);
		panel.add(btn_division);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.setBounds(530, 250, 45, 30);
		panel.add(btn_multiply);
		
		JButton btn_Rbrackets = new JButton(")");
		btn_Rbrackets.setBounds(590, 210, 45, 30);
		panel.add(btn_Rbrackets);
		
		JButton btn_Lbrackets = new JButton("(");
		btn_Lbrackets.setBounds(590, 250, 45, 30);
		panel.add(btn_Lbrackets);
		
		in_textField = new JTextField();
		in_textField.setBounds(10, 85, 630, 35);
		panel.add(in_textField);
		in_textField.setColumns(10);
		
		JButton btn_Power = new JButton("power");
		btn_Power.setBounds(200, 170, 100, 30);
		panel.add(btn_Power);
		
		JButton btn_Abs = new JButton("Abs");
		btn_Abs.setBounds(200, 210, 100, 30);
		panel.add(btn_Abs);
		
		JButton btn_Factorial = new JButton("Factorial");
		btn_Factorial.setFont(new Font("Dialog", Font.BOLD, 12));
		btn_Factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Factorial.setBounds(200, 250, 100, 30);
		panel.add(btn_Factorial);
		
		JButton btn_e = new JButton("e");
		btn_e.setBounds(200, 290, 45, 30);
		panel.add(btn_e);
		
		JButton btn_π = new JButton("π");
		btn_π.setBounds(255, 290, 45, 30);
		panel.add(btn_π);
		
		JButton btnOot = new JButton("root");
		btnOot.setBounds(310, 170, 100, 30);
		panel.add(btnOot);
		
		JButton btn_Ln = new JButton("ln");
		btn_Ln.setBounds(310, 210, 100, 30);
		panel.add(btn_Ln);
		
		JButton btn_Log = new JButton("log");
		btn_Log.setBounds(310, 250, 100, 30);
		panel.add(btn_Log);
	}
}