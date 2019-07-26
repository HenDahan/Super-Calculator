package UI;
import Utility.Function;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Function_Calculator_Frame {

	private JFrame frame;
	private JTextField textOutput;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;

	private JTextField textOutput2;
	private JTextField textOutput3;
	private JTextField textOutput4;
	private JTextField textOutput5;

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
		frame.setBounds(100, 100, 600, 610);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblD = new JLabel("=0");
		lblD.setBounds(310, 80, 20, 15);
		panel.add(lblD);
		
		JLabel lblSelectFunctionType = new JLabel("The function is type of: aX^2 + bX + c = 0");
		lblSelectFunctionType.setBounds(24, 0, 300, 63);
		panel.add(lblSelectFunctionType);
		
		
		textA = new JTextField();
		textA.setBounds(30, 80, 40, 20);
		panel.add(textA);
		
		textB = new JTextField();
		textB.setBounds(130, 80, 40, 20);
		panel.add(textB);
		
		textC = new JTextField();
		textC.setBounds(230, 80, 40, 20);
		panel.add(textC);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(45, 63, 20, 15);
		panel.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setBounds(145, 63, 20, 15);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(245, 63, 20, 15);
		panel.add(lblC);
		
	
		
		JButton btnCalculateRoots = new JButton("Calculate Roots");
		btnCalculateRoots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					answer = Function.square(a, b, c);
					
				}catch(Exception e1){
					answer = "Please fill a valid number inside: a,b,c.";
				}
					textOutput.setText(answer);
				}	
		});
		btnCalculateRoots.setBounds(350, 80, 190, 25);
		panel.add(btnCalculateRoots);
		
		textOutput = new JTextField();
		textOutput.setBounds(20, 125, 550, 35);
		panel.add(textOutput);
		
		JButton btnIntersectionPoints = new JButton("Intersection Points");
		btnIntersectionPoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					answer = Function.intersectionPointsSquare(a, b, c);

				}catch(Exception e1){
					answer = "Please fill a valid number inside: a,b,c.";
				}
					textOutput2.setText(answer);
				}	
		});
		btnIntersectionPoints.setBounds(350, 180, 190, 25);
		panel.add(btnIntersectionPoints);
		
		textOutput2 = new JTextField();
		textOutput2.setBounds(20, 219, 550, 35);
		panel.add(textOutput2);
		
		JButton buttonEdgePoints = new JButton("Edge Points (min/max)");
		buttonEdgePoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a,b,c;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					answer = Function.edgePoints(a, b, c);

				}catch(Exception e1){
					answer = "Please fill a valid numbers inside: a,b,c.";
				}
					textOutput3.setText(answer);
				}

		});
		buttonEdgePoints.setBounds(350, 293, 190, 25);
		panel.add(buttonEdgePoints);
		
		textOutput3 = new JTextField();
		textOutput3.setBounds(20, 332, 550, 35);
		panel.add(textOutput3);
		
		textOutput4 = new JTextField();
		textOutput4.setBounds(20, 439, 550, 35);
		panel.add(textOutput4);
		
		JButton btnLimitInf = new JButton("Limit X-> inf");
		btnLimitInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					answer = Function.inf(a, b, c);

				}catch(Exception e1){
					answer = "Please fill a valid numbers inside: a,b,c.";
				}
					textOutput4.setText(answer);
				}

		});
		btnLimitInf.setBounds(350, 400, 190, 25);
		panel.add(btnLimitInf);
		
		textOutput5 = new JTextField();
		textOutput5.setBounds(20, 531, 550, 35);
		panel.add(textOutput5);
		
		JButton btnLimMinusInf = new JButton("Limit X-> - inf");
		btnLimMinusInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					answer = Function.minusInf(a, b, c);

				}catch(Exception e1){
					answer = "Please fill a valid numbers inside: a,b,c.";
				}
					textOutput5.setText(answer);
				}

		});
		btnLimMinusInf.setBounds(350, 492, 190, 25);
		panel.add(btnLimMinusInf);
		
	}
}
