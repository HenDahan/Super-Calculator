package UI;
import Utility.Function;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class Function_Calculator_Frame {

	private JFrame frame;
	private JTextField textOutput;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JTextField textD;
	private int type = 1;
	private int error = 0;
	private JTextField textOutput2;

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
		
		JLabel lblD = new JLabel("d");
		lblD.setBounds(310, 80, 20, 15);
		panel.add(lblD);
		
		JButton btnSquare = new JButton("aX^2+bX+c=0");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = 2;
				textD.setVisible(false);
				lblD.setVisible(false);
			}
		});
		btnSquare.setBounds(233, 15, 135, 40);
		panel.add(btnSquare);
		
		JButton btnCube = new JButton("aX^3+bX^2+cX+d=0");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = 3;
				textD.setVisible(true);
				lblD.setVisible(true);

			}
		});
		btnCube.setBounds(390, 15, 180, 40);
		panel.add(btnCube);
		
		JLabel lblSelectFunctionType = new JLabel("Select Function Type:");
		lblSelectFunctionType.setBounds(24, 0, 186, 63);
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
		
		textD = new JTextField();
		textD.setBounds(330, 80, 40, 20);
		panel.add(textD);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(10, 80, 20, 15);
		panel.add(lblA);
		
		JLabel lblB = new JLabel("b");
		lblB.setBounds(110, 80, 20, 15);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(210, 80, 20, 15);
		panel.add(lblC);
		
	
		
		JButton btnCalculateRoots = new JButton("Calculate Roots");
		btnCalculateRoots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,d=0;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					
					System.out.println(a+ " , "+ b+" , "+c);

					
					if (error == 0);{
						
						if (type == 1)
							answer = "Please select a tpye of a function";
						else if (type == 2)
							answer = Function.square(a, b, c);
						else
							d = Double.parseDouble(textD.getText().toString());
							System.out.println(a+ " , "+ b+" , "+c+" , "+d);

							//answer = Function.cube(a, b, c, d);
							answer = "X1 = ???";
							
					}
				}catch(Exception e1){
					answer = "Please fill a valid number inside: a,b,c,d.";
				}
					textOutput.setText(answer);
					error = 0;
				}	
		});
		btnCalculateRoots.setBounds(400, 80, 150, 25);
		panel.add(btnCalculateRoots);
		
		textOutput = new JTextField();
		textOutput.setBounds(20, 125, 550, 35);
		panel.add(textOutput);
		
		JButton btnEdgePoints = new JButton("Edge Points");
		btnEdgePoints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,d=0;
				String answer;
				try {
					a = Double.parseDouble(textA.getText().toString());
					b = Double.parseDouble(textB.getText().toString());
					c = Double.parseDouble(textC.getText().toString());
					
					System.out.println(a+ " , "+ b+" , "+c);

					
					if (error == 0);{
						
						if (type == 1)
							answer = "Please select a tpye of a function";
						else if (type == 2)
							answer = Function.edgePointsSquare(a, b, c);
						else
							d = Double.parseDouble(textD.getText().toString());
							//answer = Function.edgePointsCube(a, b, c, d);
							answer = Function.edgePointsSquare(a, b, c);
							
					}
				}catch(Exception e1){
					answer = "Please fill a valid number inside: a,b,c,d.";
				}
					textOutput2.setText(answer);
					error = 0;
				}	
		});
		btnEdgePoints.setBounds(400, 180, 150, 25);
		panel.add(btnEdgePoints);
		
		textOutput2 = new JTextField();
		textOutput2.setBounds(20, 219, 550, 35);
		panel.add(textOutput2);
		
	}
}
