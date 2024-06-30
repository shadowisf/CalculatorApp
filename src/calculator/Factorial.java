package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Factorial {

	private JFrame frame;
	private JTextField txtnumber;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial window = new Factorial();
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
	public Factorial() {
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
		btnNewButton.setBackground(new Color(255, 182, 191));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ENTER A NUMBER TO FACTORIALIZE");
		lblNewLabel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		lblNewLabel.setBounds(410, 315, 729, 109);
		frame.getContentPane().add(lblNewLabel);
		
		txtnumber = new JTextField();
		txtnumber.setBounds(600, 447, 121, 32);
		frame.getContentPane().add(txtnumber);
		txtnumber.setColumns(10);
		
		JButton btnNewButton_factorial_1 = new JButton("CONFIRM");
		btnNewButton_factorial_1.setBackground(new Color(255, 182, 191));
		btnNewButton_factorial_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				String number = txtnumber.getText();
				long num = Long.parseLong(number);
				long fac = num;
				for (long i = num; i > 1; i--) {
					fac = fac * (i - 1);
				}
				textField.setText(Long.toString(fac));
			}
		});
		btnNewButton_factorial_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_factorial_1.setBounds(458, 528, 263, 49);
		frame.getContentPane().add(btnNewButton_factorial_1);
		
		JButton btnNewButton_factorial = new JButton("RESET");
		btnNewButton_factorial.setBackground(new Color(255, 182, 191));
		btnNewButton_factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtnumber.setText(null);
				textField.setText(null);
			}
		});
		btnNewButton_factorial.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_factorial.setBounds(811, 528, 263, 49);
		frame.getContentPane().add(btnNewButton_factorial);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Factorial.class.getResource("/calculator/factorial(TITLE).png")));
		lblNewLabel_1.setBounds(447, 89, 650, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER NUMBER:\r\n");
		lblNewLabel_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(420, 441, 170, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("RESULT:");
		lblNewLabel_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(731, 444, 170, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(823, 447, 274, 32);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Factorial.class.getResource("/calculator/factorial(BACKGROUND).png")));
		lblNewLabel_3.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
