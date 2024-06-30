package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class Fibonacci {

	private JFrame frame;
	private JTextField txtnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci window = new Fibonacci();
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
	public Fibonacci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(frame);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.dispose();
			}
		});
		
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(252, 237, 138));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("ENTER A NUMBER");
		lblNewLabel.setToolTipText("Enter a number");
		lblNewLabel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		lblNewLabel.setBounds(449, 288, 358, 64);
		frame.getContentPane().add(lblNewLabel);

		txtnumber = new JTextField();
		txtnumber.setBounds(817, 304, 254, 32);
		frame.getContentPane().add(txtnumber);
		txtnumber.setColumns(10);

		final JTextArea result = new JTextArea();
		result.setEditable(false);
		result.setLineWrap(true);
		result.setBounds(581, 591, 332, 32);
		frame.getContentPane().add(result);
		
		JButton btnNewButton_factorial_1 = new JButton("RESULT");
		btnNewButton_factorial_1.setBackground(new Color(252, 237, 138));
		btnNewButton_factorial_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int input = Integer.parseInt(txtnumber.getText());
					int a = 0;
					int b = 1;
					result.setText(a+" "+b+" ");
					
					for (int i = 2; i < input; i++) {
						int c = a + b;
						result.append(c+" ");
						a = b;
						b = c;
					}
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"invalid input.");
				}
			}
		});

		btnNewButton_factorial_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_factorial_1.setBounds(449, 377, 263, 49);
		frame.getContentPane().add(btnNewButton_factorial_1);

		JButton btnNewButton_factorial = new JButton("RESET");
		btnNewButton_factorial.setBackground(new Color(252, 237, 138));
		btnNewButton_factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnumber.setText(null);
				result.setText(null);
			}
		});
		
		btnNewButton_factorial.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_factorial.setBounds(808, 377, 263, 49);
		frame.getContentPane().add(btnNewButton_factorial);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jcbbe\\Desktop\\UI Designs\\fibonacci(TITLE).png"));
		lblNewLabel_1.setBounds(459, 58, 604, 160);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(449, 473, 622, 10);
		frame.getContentPane().add(separator);
		
		JLabel lblFibonacciSequence = new JLabel("FIBONACCI SEQUENCE");
		lblFibonacciSequence.setToolTipText("Enter a number");
		lblFibonacciSequence.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblFibonacciSequence.setBounds(581, 484, 358, 64);
		frame.getContentPane().add(lblFibonacciSequence);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jcbbe\\Desktop\\UI Designs\\fibonacci(BACKGROUND).png"));
		lblNewLabel_2.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}