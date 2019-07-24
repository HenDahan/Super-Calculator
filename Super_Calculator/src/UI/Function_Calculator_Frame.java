package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Function_Calculator_Frame {

	private JFrame frame;

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
		frame.setBounds(100, 100, 600, 185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAxbxc = new JButton("aX^2+bX+c=0");
		btnAxbxc.setBounds(233, 15, 135, 40);
		panel.add(btnAxbxc);
		
		JButton btnAxbxcxd = new JButton("aX^3+bX^2+cX+d=0");
		btnAxbxcxd.setBounds(390, 15, 180, 40);
		panel.add(btnAxbxcxd);
		
		JLabel lblSelectFunctionType = new JLabel("Select Function Type:");
		lblSelectFunctionType.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSelectFunctionType.setBounds(24, 0, 186, 63);
		panel.add(lblSelectFunctionType);
	}
}
