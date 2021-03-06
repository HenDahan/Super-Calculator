package UI;
/*
import UI.Basic_Calc_Frame;
import UI.Base_Calculator_Frame;
import UI.Advanced_Calc_Frame;
import UI.Fibonacci_Series_Frame;
import UI.Function_Calculator_Frame;
import UI.Prime_Factorization;*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame window = new Main_Frame();
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
	public Main_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Super Calculator Made By: Kfir Rahamim and Hen Dahan");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.setBackground(Color.orange);
		
		JButton btnBasicCalculator = new JButton("Basic Calculator");
		btnBasicCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Basic_Calc_Frame base_frame = new Basic_Calc_Frame();
				base_frame.Basic_Frame();
				
			}
		});
		btnBasicCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnBasicCalculator.setBounds(10, 50, 200, 50);
		panel.add(btnBasicCalculator);
		
		JButton btnAdvancedCalculator = new JButton("Advanced Calculator");
		btnAdvancedCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Advanced_Calc_Frame ad_calc = new Advanced_Calc_Frame();
			ad_calc.Advanced_Frame();
			}
		});
		btnAdvancedCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnAdvancedCalculator.setBounds(10, 110, 200, 50);
		panel.add(btnAdvancedCalculator);
		
		JButton btnBaseCalculator = new JButton("Base Calculator");
		btnBaseCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Base_Calculator_Frame.Base_Frame();
			}
		});
		btnBaseCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnBaseCalculator.setBounds(10, 170, 200, 50);
		panel.add(btnBaseCalculator);

		JButton btnFunctionCalculator = new JButton("Function Calculator");
		btnFunctionCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function_Calculator_Frame function_frame = new Function_Calculator_Frame();
				function_frame.Function_Frame();
				
			}
		});
		btnFunctionCalculator.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnFunctionCalculator.setBounds(10, 230, 200, 50);
		panel.add(btnFunctionCalculator);
		
		JButton btnFibonacciSeries = new JButton("Fibonacci Sequence");
		btnFibonacciSeries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fibonacci_Series_Frame.Fib_Frame();
				//close();
				
			}
		});
		btnFibonacciSeries.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnFibonacciSeries.setBounds(10, 290, 200, 50);
		panel.add(btnFibonacciSeries);
		
		JButton btnPrimeFactorization = new JButton("Prime Factorization");
		btnPrimeFactorization.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Prime_Factorization.Prime_Frame();
			}
		});
		btnPrimeFactorization.setFont(new Font("NanumMyeongjo", Font.BOLD, 16));
		btnPrimeFactorization.setBounds(10, 350, 200, 50);
		panel.add(btnPrimeFactorization);
		
		
		JTextArea txtrMenu = new JTextArea();
		txtrMenu.setText(" Basic calculator - you can use the"
				+ "\n basic operators \"+\", \"-\", \"*\" and \"/\"."
				+ "\n\n\n Advanced Calculator - you can use the"
				+ "\n advanced operators \"power\", \"root\","
				+ "\n \"factorial\", \"e\" and \"Pi\"."
				+ "\n\n Base calculator - converting a number"
				+ "\n to different bases such as Base2,"
				+ "\n Base4,Base 8, Base10 and Base16."
				+ "\n\n Function Calculator - solve a function"
				+ "\n of up to X^3, Min/Max & intersection"
				+ "\n points, Limit Calculations."
				+ "\n\n Fibonacci Series - gives you the"
				+ "\n value of the N's index in"
				+ "\n fibonacci series."
				+ "\n\n Prime Factorization - gives you the"
				+ "\n primes factorization of a given number.");
		txtrMenu.setBounds(230, 50, 250, 350);
		panel.add(txtrMenu);
		
		JLabel lblSuperCalculator = new JLabel("Super Calculator - The Most Amazing Calculator In the World");
		lblSuperCalculator.setBounds(10, 10, 455, 25);
		panel.add(lblSuperCalculator);
		

		
	}
	
	public void close() {
		//WindowEvent winClosingEvent = new WindowEvent(this.WindowEvent.WINDOW_CLOSING);
	}
}
