package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Fibonacci_Series_Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Fib_Frame() {
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
		frame.setBounds(100, 100, 500, 440);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
